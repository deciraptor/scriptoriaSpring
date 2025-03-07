package fr.scriptoria.models.documents;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;

@Document(collection = "livres")
public class BookDocument {

    // attributes

    @Id
    private Long bookId;

    private String projectId; // Link with SQL project

    @ElementCollection
    private List<ChapterDocument> chapters;

    // constructors

    public BookDocument() {
    }

    public BookDocument(Long bookId, String projectId, List<ChapterDocument> chapters) {
        this.bookId = bookId;
        this.projectId = projectId;
        this.chapters = chapters;
    }

    // getters and setters

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public List<ChapterDocument> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterDocument> chapters) {
        this.chapters = chapters;
    }

}
