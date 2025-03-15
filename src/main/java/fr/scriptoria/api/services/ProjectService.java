package fr.scriptoria.api.services;

import java.util.List;

import fr.scriptoria.api.dto.ProjectDTO;
import fr.scriptoria.api.dto.ProjectOutpoutDTO;

public interface ProjectService {

    ProjectOutpoutDTO createProject(ProjectDTO project); 

    List<ProjectOutpoutDTO>  getAllProjects();

    List<ProjectOutpoutDTO> getAllProjectByUserId(Long userId); 
    
}