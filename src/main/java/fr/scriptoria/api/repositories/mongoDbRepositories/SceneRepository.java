package fr.scriptoria.api.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.api.models.documents.SceneDocument;

public interface SceneRepository extends MongoRepository<SceneDocument, Long> {

}
