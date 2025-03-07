package fr.scriptoria.models.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "scenes")
public class SceneDocument {

    // attributes

    @Id
    private String id;

    private String chapterId; // Link with MongoDB chapter
    private String content;

    // constructors

    public SceneDocument() {
    }

    public SceneDocument(String id, String chapterId, String content) {
        this.id = id;
        this.chapterId = chapterId;
        this.content = content;
    }

    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
