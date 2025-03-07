package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.models.documents.SceneDocument;

public interface SceneRepository extends JpaRepository<SceneDocument, Long> {

}
