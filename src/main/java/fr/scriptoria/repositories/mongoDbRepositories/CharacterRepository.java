package fr.scriptoria.repositories.mongoDbRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.models.documents.CharacterDocument;

public interface CharacterRepository extends JpaRepository<CharacterDocument, Long> {

}
