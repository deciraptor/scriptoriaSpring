package fr.scriptoria.api.dto;

import java.util.List;
import java.util.UUID;

public class BookDTO {
    private UUID bookId;
    private Long projectId;
    private List<ChapterDTO> chapters;

    // Getters et Setters
    public UUID getBookId() {
        return bookId;
    }

    public void setBookId(UUID bookId) {
        this.bookId = bookId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public List<ChapterDTO> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterDTO> chapters) {
        this.chapters = chapters;
    }
}

