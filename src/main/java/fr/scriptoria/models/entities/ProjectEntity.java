package fr.scriptoria.models.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import fr.scriptoria.models.documents.BookDocument;
import fr.scriptoria.models.enumeration.TypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "projets")
public class ProjectEntity {

    // simple attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    private String title;

    private String subTitle;

    @Enumerated(EnumType.STRING)
    private TypeEnum typeProject;

    private String description;

    @CreationTimestamp
    private LocalDateTime dateCreation;

    private String bookId;

    // table attributes

    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private NoteEntity note;

    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private InspirationEntity Inspiration;

    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private CharacterEntity character;

    @ManyToOne
    @JoinColumn(name = "", referencedColumnName = "")
    private BookDocument book;

    // constructors

    public ProjectEntity() {
    }

    public ProjectEntity(Long projectId, String title, String subTitle, TypeEnum typeProject, String description,
            LocalDateTime dateCreation, String bookId, NoteEntity note, InspirationEntity inspiration,
            CharacterEntity character, BookDocument book) {
        this.projectId = projectId;
        this.title = title;
        this.subTitle = subTitle;
        this.typeProject = typeProject;
        this.description = description;
        this.dateCreation = dateCreation;
        this.bookId = bookId;
        this.note = note;
        Inspiration = inspiration;
        this.character = character;
        this.book = book;
    }

    // getters and setters

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public TypeEnum getTypeProject() {
        return typeProject;
    }

    public void setTypeProject(TypeEnum typeProject) {
        this.typeProject = typeProject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public NoteEntity getNote() {
        return note;
    }

    public void setNote(NoteEntity note) {
        this.note = note;
    }

    public InspirationEntity getInspiration() {
        return Inspiration;
    }

    public void setInspiration(InspirationEntity inspiration) {
        Inspiration = inspiration;
    }

    public CharacterEntity getCharacter() {
        return character;
    }

    public void setCharacter(CharacterEntity character) {
        this.character = character;
    }

    public BookDocument getBook() {
        return book;
    }

    public void setBook(BookDocument book) {
        this.book = book;
    }

}
