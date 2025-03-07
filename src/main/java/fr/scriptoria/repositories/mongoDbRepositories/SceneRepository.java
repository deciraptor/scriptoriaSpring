package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.models.documents.SceneDocument;

public interface SceneRepository extends MongoRepository<SceneDocument, Long> {

}
