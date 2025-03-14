package fr.scriptoria.api.models.documents;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "chapitres")
public class ChapterDocument {

    // attributes

    @Id
    private Long chapterId;

    private Long bookId; // Link with MongoDB book

    private String chapterTitle;

    // @ElementCollection
    // private List<SceneDocument> scenes;

    private String text;

    // constructors

    public ChapterDocument() {
    }

    public ChapterDocument(Long chapterId, Long bookId, String chapterTitle, String text) {
        this.chapterId = chapterId;
        this.bookId = bookId;
        this.chapterTitle = chapterTitle;
        this.text = text;
    }

    // getters and setters

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
