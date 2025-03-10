package fr.scriptoria.repositories.mySqlRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.models.entities.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
    
}
