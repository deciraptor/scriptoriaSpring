package fr.scriptoria.services;

import java.util.List;

import fr.scriptoria.dto.ProjectDTO;
import fr.scriptoria.dto.ProjectOutpoutDTO;

public interface ProjectService {

    ProjectOutpoutDTO createProject(ProjectDTO project); 

    List<ProjectOutpoutDTO>  getAllProjects(); 
    
}