package fr.scriptoria.api.dto;

public class ChapterDTO {

    private Long chapterId;
    private String chapterTitle;
    private String text;

    // Constructeur vide
    public ChapterDTO() {
    }

    // Constructeur complet
    public ChapterDTO(Long chapterId, String chapterTitle, String text) {
        this.chapterId = chapterId;
        this.chapterTitle = chapterTitle;
        this.text = text;
    }

    // Getters & setters
    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
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

