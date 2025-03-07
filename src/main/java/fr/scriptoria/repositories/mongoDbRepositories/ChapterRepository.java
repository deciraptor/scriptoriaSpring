package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.models.documents.ChapterDocument;

public interface ChapterRepository extends JpaRepository<ChapterDocument, Long> {

}
