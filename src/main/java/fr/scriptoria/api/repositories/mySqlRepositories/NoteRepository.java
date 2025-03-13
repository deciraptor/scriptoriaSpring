package fr.scriptoria.api.repositories.mySqlRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.scriptoria.api.models.entities.NoteEntity;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {

}
