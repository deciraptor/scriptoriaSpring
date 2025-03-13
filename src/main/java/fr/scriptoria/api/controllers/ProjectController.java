package fr.scriptoria.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.scriptoria.api.dto.ProjectDTO;
import fr.scriptoria.api.dto.ProjectOutpoutDTO;
import fr.scriptoria.api.services.ProjectService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    // Créer un nouveau projet
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectOutpoutDTO createProject(@RequestBody ProjectDTO projectDTO) {

        return projectService.createProject(projectDTO);
    }

    // Récupérer tous les projets
    @GetMapping("/show")
    public List<ProjectOutpoutDTO> getAllProjects() {
        return projectService.getAllProjects();
    }
}
