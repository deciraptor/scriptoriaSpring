package fr.scriptoria.api.services;

import java.util.List;
import java.util.UUID;

import fr.scriptoria.api.dto.BookDTO;
import fr.scriptoria.api.dto.ChapterDTO;

public interface BookService {
    List<BookDTO> getBooksByProjectId(Long projectId);

    ChapterDTO createChapter(UUID bookId, ChapterDTO chapterDTO);

}
