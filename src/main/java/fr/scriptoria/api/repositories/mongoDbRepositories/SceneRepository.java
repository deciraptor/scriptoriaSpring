package fr.scriptoria.api.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.scriptoria.api.models.documents.SceneDocument;

@Repository
public interface SceneRepository extends MongoRepository<SceneDocument, Long> {

}
