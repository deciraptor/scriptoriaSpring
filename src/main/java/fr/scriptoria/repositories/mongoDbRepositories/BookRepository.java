package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.models.documents.BookDocument;

public interface BookRepository extends JpaRepository<BookDocument, Long> {

}
