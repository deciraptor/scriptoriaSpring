package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.models.documents.ChapterDocument;

public interface ChapterRepository extends MongoRepository<ChapterDocument, Long> {

}
