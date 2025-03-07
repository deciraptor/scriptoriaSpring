package fr.scriptoria.repositories.mySqlRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.scriptoria.models.entities.NoteEntity;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {

}
