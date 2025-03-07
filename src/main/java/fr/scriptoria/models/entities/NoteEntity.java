package fr.scriptoria.models.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class NoteEntity {

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "projectId")
    private ProjectEntity project;

}
