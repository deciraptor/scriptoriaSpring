package fr.scriptoria.api.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.scriptoria.api.dto.BookDTO;
import fr.scriptoria.api.dto.ChapterDTO;
import fr.scriptoria.api.models.documents.BookDocument;
import fr.scriptoria.api.models.documents.ChapterDocument;
import fr.scriptoria.api.repositories.mongoDbRepositories.BookRepository;
import fr.scriptoria.api.repositories.mongoDbRepositories.ChapterRepository;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Override
    public List<BookDTO> getBooksByProjectId(Long projectId) {
        List<BookDocument> books = bookRepository.findByProjectId(projectId);

        return books.stream().map(book -> {
            BookDTO bookDTO = new BookDTO();
            BeanUtils.copyProperties(book, bookDTO);

            List<ChapterDTO> chaptersDTO = book.getChapters().stream().map(chapter -> {
                ChapterDTO chapterDTO = new ChapterDTO();
                BeanUtils.copyProperties(chapter, chapterDTO);
                return chapterDTO;
            }).collect(Collectors.toList());

            bookDTO.setChapters(chaptersDTO);
            return bookDTO;
        }).collect(Collectors.toList());
    }

    @Override
    public ChapterDTO createChapter(Long bookId, ChapterDTO chapterDTO) {

        // 1. Convertir le ChapterDTO en ChapterDocument
        ChapterDocument chapter = new ChapterDocument();
        chapter.setChapterTitle(chapterDTO.getChapterTitle());
        chapter.setText(chapterDTO.getText());
        chapter.setBookId(bookId); // important pour lier au livre existant

        // 2. Sauvegarder le chapitre dans MongoDB
        ChapterDocument savedChapter = chapterRepository.save(chapter);

        // 3. Mettre à jour le livre existant avec le nouveau chapitre
        BookDocument book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Livre introuvable"));

        book.getChapters().add(savedChapter);
        bookRepository.save(book);

        // 4. Retourner le DTO correspondant au chapitre créé
        ChapterDTO result = new ChapterDTO();
        BeanUtils.copyProperties(savedChapter, result);

        return result;
    }
}
