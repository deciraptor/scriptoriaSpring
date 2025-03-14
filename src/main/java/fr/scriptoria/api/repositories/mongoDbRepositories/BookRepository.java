package fr.scriptoria.api.repositories.mongoDbRepositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.scriptoria.api.models.documents.BookDocument;

@Repository
public interface BookRepository extends MongoRepository<BookDocument, Long> {
    List<BookDocument> findByProjectId(Long projectId);

}
