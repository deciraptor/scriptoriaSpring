package fr.scriptoria.api.repositories.mySqlRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.api.models.entities.NoteEntity;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {

}
