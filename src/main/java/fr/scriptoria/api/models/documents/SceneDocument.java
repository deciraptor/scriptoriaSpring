package fr.scriptoria.api.models.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "scenes")
public class SceneDocument {

    // attributes

    @Id
    private Long sceneId;

    private String chapterId; // Link with MongoDB chapter
    private String content;

    // constructors

    public SceneDocument() {
    }

    public SceneDocument(Long sceneId, String chapterId, String content) {
        this.sceneId = sceneId;
        this.chapterId = chapterId;
        this.content = content;
    }

    // getters and setters

    public Long getSceneId() {
        return sceneId;
    }

    public void setSceneId(Long sceneId) {
        this.sceneId = sceneId;
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
