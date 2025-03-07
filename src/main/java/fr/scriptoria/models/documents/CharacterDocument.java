package fr.scriptoria.models.documents;

import fr.scriptoria.models.entities.ProjectEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class CharacterDocument {

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "projectId")
    private ProjectEntity project;

}
