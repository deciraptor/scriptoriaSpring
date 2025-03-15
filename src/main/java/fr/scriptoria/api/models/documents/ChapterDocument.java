package fr.scriptoria.api.models.documents;

import java.util.UUID;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Document(collection = "chapitres")
public class ChapterDocument {

    // attributes

    @Id
    private Long chapterId;

    private UUID bookId; // Link with MongoDB book

    private String chapterTitle;

    // @ElementCollection
    // private List<SceneDocument> scenes;

    private String text;

    // table attributes ManyToOne

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "bookId")
    private BookDocument BookDocument;

    // constructors

    public ChapterDocument() {
    }

    public ChapterDocument(Long chapterId, UUID bookId, String chapterTitle, String text,
            fr.scriptoria.api.models.documents.BookDocument bookDocument) {
        this.chapterId = chapterId;
        this.bookId = bookId;
        this.chapterTitle = chapterTitle;
        this.text = text;
        BookDocument = bookDocument;
    }

    // getters and setters
    
    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
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

    public BookDocument getBookDocument() {
        return BookDocument;
    }

    public void setBookDocument(BookDocument bookDocument) {
        BookDocument = bookDocument;
    }

}
