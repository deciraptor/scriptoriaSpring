package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.scriptoria.models.documents.BookDocument;

public interface BookRepository extends MongoRepository<BookDocument, Long> {

}
