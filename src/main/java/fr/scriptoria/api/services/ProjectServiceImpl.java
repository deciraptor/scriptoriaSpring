package fr.scriptoria.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.scriptoria.api.dto.ProjectDTO;
import fr.scriptoria.api.dto.ProjectOutpoutDTO;
import fr.scriptoria.api.models.documents.BookDocument;
import fr.scriptoria.api.models.documents.ChapterDocument;
import fr.scriptoria.api.models.entities.ProjectEntity;
import fr.scriptoria.api.repositories.mongoDbRepositories.BookRepository;
import fr.scriptoria.api.repositories.mongoDbRepositories.ChapterRepository;
import fr.scriptoria.api.repositories.mySqlRepositories.ProjectRepository;
import fr.scriptoria.login.models.User;
import fr.scriptoria.login.repository.UserRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Override
    public ProjectOutpoutDTO createProject(ProjectDTO projectDTO) {

        // Conversion du DTO en entité
        ProjectEntity projectEntity = new ProjectEntity();
        BeanUtils.copyProperties(projectDTO, projectEntity);

        // Récupération et association de l'utilisateur
        User userEntity = userRepository.findById(projectDTO.getUserEntityId()).get();
        projectEntity.setUserEntity(userEntity);
        userEntity.getProjects().add(projectEntity);

        // Sauvegarde (dans la base SQL)
        projectRepository.save(projectEntity);
        userRepository.save(userEntity);

        // Création automatique d'un livre (BookDocument) associé au projet
        BookDocument book = new BookDocument();
        book.setProjectId(projectEntity.getProjectId());
        book.setChapters(new ArrayList<>());
        book.setBookId(UUID.randomUUID());
        BookDocument savedBook = bookRepository.save(book);

        // Création automatique d'un premier chapitre (ChapterDocument) pour le livre
        ChapterDocument chapter = new ChapterDocument();
        chapter.setBookId(savedBook.getBookId());
        chapter.setChapterTitle("Chapitre 1"); // titre par défaut
        ChapterDocument savedChapter = chapterRepository.save(chapter);

        // Mise à jour du livre pour référencer le chapitre créé
        savedBook.getChapters().add(savedChapter);
        bookRepository.save(savedBook);

        // Préparation du DTO de sortie
        ProjectOutpoutDTO projectOutpoutDTO = new ProjectOutpoutDTO();
        BeanUtils.copyProperties(projectEntity, projectOutpoutDTO);

        return projectOutpoutDTO;

    }

    @Override
    public List<ProjectOutpoutDTO> getAllProjects() {

        List<ProjectOutpoutDTO> projects = new ArrayList<ProjectOutpoutDTO>();

        for (ProjectEntity projectEntity : projectRepository.findAll()) {
            ProjectOutpoutDTO projectOutpoutDTO = new ProjectOutpoutDTO();
            BeanUtils.copyProperties(projectEntity, projectOutpoutDTO);
            projects.add(projectOutpoutDTO);
        }

        return projects;

    }

    @Override
    public List<ProjectOutpoutDTO> getAllProjectByUserId(Long userId) {
        

        List<ProjectOutpoutDTO> projects = new ArrayList<ProjectOutpoutDTO>();

        User user  = userRepository.findById(userId).get();

        for (ProjectEntity projectEntity : user.getProjects()) {
            ProjectOutpoutDTO projectOutpoutDTO = new ProjectOutpoutDTO();
            BeanUtils.copyProperties(projectEntity, projectOutpoutDTO);
            projects.add(projectOutpoutDTO);
        }

        return projects;
    }

}
