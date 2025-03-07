package fr.scriptoria.models.documents;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Id;

@Document(collection = "chapitres")
public class ChapterDocument {

    // attributes

    @Id
    private Long chapterId;

    private String bookId; // Link with MongoDB book

    private String title;

    @ElementCollection
    private List<SceneDocument> scenes; 

    // constructors

    public ChapterDocument() {
    }

    public ChapterDocument(Long chapterId, String bookId, String title, List<SceneDocument> scenes) {
        this.chapterId = chapterId;
        this.bookId = bookId;
        this.title = title;
        this.scenes = scenes;
    }
    
    // getters and setters

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SceneDocument> getScenes() {
        return scenes;
    }

    public void setScenes(List<SceneDocument> scenes) {
        this.scenes = scenes;
    }

}
