package fr.scriptoria.api.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.api.models.documents.BookDocument;

public interface BookRepository extends MongoRepository<BookDocument, Long> {

}
