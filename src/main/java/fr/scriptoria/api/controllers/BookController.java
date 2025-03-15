package fr.scriptoria.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import fr.scriptoria.api.dto.BookDTO;
import fr.scriptoria.api.dto.ChapterDTO;
import fr.scriptoria.api.services.BookService;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/api/books")
// @CrossOrigin(origins = "*")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/show/{projectId}")
    @ResponseStatus(HttpStatus.OK)
    public List<BookDTO> getBooksByProject(@PathVariable Long projectId) {
        return bookService.getBooksByProjectId(projectId);
    }

    @PostMapping("/{bookId}/chapters")
    @ResponseStatus(HttpStatus.CREATED)
    public ChapterDTO createChapter(@PathVariable UUID bookId, @RequestBody ChapterDTO chapterDTO) {
        return bookService.createChapter(bookId, chapterDTO);
    }

}
