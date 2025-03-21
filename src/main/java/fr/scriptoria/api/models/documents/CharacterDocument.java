package fr.scriptoria.api.models.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import fr.scriptoria.api.models.entities.ProjectEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Document(collection = "characters")
public class CharacterDocument {

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "projectId")
    private ProjectEntity project;

}
