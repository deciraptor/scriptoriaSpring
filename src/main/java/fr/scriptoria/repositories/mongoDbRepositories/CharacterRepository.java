package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.models.documents.CharacterDocument;

public interface CharacterRepository extends MongoRepository<CharacterDocument, Long> {

}
