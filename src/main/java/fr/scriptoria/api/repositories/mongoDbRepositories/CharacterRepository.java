package fr.scriptoria.api.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.api.models.documents.CharacterDocument;

public interface CharacterRepository extends MongoRepository<CharacterDocument, Long> {

}
