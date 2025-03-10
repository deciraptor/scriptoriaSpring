package fr.scriptoria.models.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "notes")
public class NoteEntity {

    // simple attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long noteId;

    private String title;

    private String description;

    @CreationTimestamp
    private LocalDateTime dateCreation;

    // table attributes ManyToOne

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "projectId")
    private ProjectEntity projectEntity;

    // constructors

    public NoteEntity() {
    }

    public NoteEntity(Long noteId, String title, String description, LocalDateTime dateCreation,
            ProjectEntity projectEntity) {
        this.noteId = noteId;
        this.title = title;
        this.description = description;
        this.dateCreation = dateCreation;
        this.projectEntity = projectEntity;
    }

    // getters and setters

    public Long getNoteId() {
        return noteId;
    }

    public void setNoteId(Long noteId) {
        this.noteId = noteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public ProjectEntity getProject() {
        return projectEntity;
    }

    public void setProject(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

}
