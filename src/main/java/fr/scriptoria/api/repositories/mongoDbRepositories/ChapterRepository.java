package fr.scriptoria.api.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.api.models.documents.ChapterDocument;

public interface ChapterRepository extends MongoRepository<ChapterDocument, Long> {

}
