package fr.scriptoria.api.models.documents;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import fr.scriptoria.api.models.entities.ProjectEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Document(collection = "livres")
public class BookDocument {

    // attributes

    @Id
    private Long bookId;

    private Long projectId; // Link with SQL project

    @ElementCollection
    private List<ChapterDocument> chapters;

    // table attributes ManyToOne

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "projectId")
    private ProjectEntity projectEntity;

    // table attributes OneToMany

    @OneToMany(mappedBy = "bookDocument", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ChapterDocument> notes = new ArrayList<>();

    // constructors

    public BookDocument() {
    }

    public BookDocument(Long bookId, Long projectId, List<ChapterDocument> chapters, ProjectEntity projectEntity,
            List<ChapterDocument> notes) {
        this.bookId = bookId;
        this.projectId = projectId;
        this.chapters = chapters;
        this.projectEntity = projectEntity;
        this.notes = notes;
    }

    // getters and setters

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public List<ChapterDocument> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterDocument> chapters) {
        this.chapters = chapters;
    }

    public ProjectEntity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntity projectEntity) {
        this.projectEntity = projectEntity;
    }

    public List<ChapterDocument> getNotes() {
        return notes;
    }

    public void setNotes(List<ChapterDocument> notes) {
        this.notes = notes;
    }

}
