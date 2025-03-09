package fr.scriptoria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.scriptoria.models.entities.ProjectEntity;
import fr.scriptoria.repositories.mySqlRepositories.ProjectRepository;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    // Créer un nouveau projet
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectEntity createProject(@RequestBody ProjectEntity project) {
        // Vous pouvez ajouter ici des validations, ou définir des valeurs par défaut
        return projectRepository.save(project);
    }

    // Récupérer tous les projets
    @GetMapping("/show")
    public List<ProjectEntity> getAllProjects() {
        return projectRepository.findAll();
    }
}
