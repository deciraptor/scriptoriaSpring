package fr.scriptoria.api.repositories.mySqlRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.api.models.entities.InspirationEntity;

public interface InspirationRepository extends JpaRepository<InspirationEntity, Long> {

}
