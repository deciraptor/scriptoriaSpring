package fr.scriptoria.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.scriptoria.api.dto.ProjectDTO;
import fr.scriptoria.api.dto.ProjectOutpoutDTO;
import fr.scriptoria.api.models.entities.ProjectEntity;
import fr.scriptoria.api.repositories.mySqlRepositories.ProjectRepository;
import fr.scriptoria.login.models.User;
import fr.scriptoria.login.repository.UserRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public ProjectOutpoutDTO createProject(ProjectDTO projectDTO) {

        ProjectEntity projectEntity = new ProjectEntity();

        BeanUtils.copyProperties(projectDTO, projectEntity);

        User userEntity = userRepository.findById(projectDTO.getUserEntityId()).get();

        projectEntity.setUserEntity(userEntity);

        userEntity.getProjects().add(projectEntity);

        userRepository.save(userEntity);

        return projectEntity;

        

        ProjectOutpoutDTO projectOutpoutDTO = new ProjectOutpoutDTO();

        BeanUtils.copyProperties(projectEntity, projectOutpoutDTO);

        return projectOutpoutDTO;

    }

    @Override
    public List<ProjectOutpoutDTO> getAllProjects() {

        List<ProjectOutpoutDTO> projects = new ArrayList<ProjectOutpoutDTO>();

        for (ProjectEntity projectEntity : projectRepository.findAll() ) {
            ProjectOutpoutDTO projectOutpoutDTO = new ProjectOutpoutDTO();
            BeanUtils.copyProperties(projectEntity, projectOutpoutDTO);
            projects.add(projectOutpoutDTO);
        }
        
        return projects;

    }

}
