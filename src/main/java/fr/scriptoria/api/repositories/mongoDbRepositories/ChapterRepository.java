package fr.scriptoria.api.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.scriptoria.api.models.documents.ChapterDocument;

@Repository
public interface ChapterRepository extends MongoRepository<ChapterDocument, Long> {

}
