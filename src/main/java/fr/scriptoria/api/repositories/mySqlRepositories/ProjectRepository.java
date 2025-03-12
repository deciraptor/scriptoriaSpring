package fr.scriptoria.api.repositories.mySqlRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.api.models.entities.ProjectEntity;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {
    
}
