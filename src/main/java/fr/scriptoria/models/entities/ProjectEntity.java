package fr.scriptoria.models.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import fr.scriptoria.models.enumeration.TypeEnum;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "projets")
public class ProjectEntity {

    // attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;

    private String subTitle;

    @Enumerated(EnumType.STRING)
    private TypeEnum type;

    private String description;

    @CreationTimestamp
    private LocalDateTime dateCreation;

    private String bookId;

    @ElementCollection
    private List<String> notes;

    @ElementCollection
    private List<String> inspirations;

    @ElementCollection
    private List<String> characters;

    // constructors

    public ProjectEntity() {
    }

    public ProjectEntity(String id, String title, String subTitle, TypeEnum type, String description,
            LocalDateTime dateCreation, String bookId, List<String> notes, List<String> inspirations,
            List<String> characters) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.type = type;
        this.description = description;
        this.dateCreation = dateCreation;
        this.bookId = bookId;
        this.notes = notes;
        this.inspirations = inspirations;
        this.characters = characters;
    }

    // getters and setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
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

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public List<String> getInspirations() {
        return inspirations;
    }

    public void setInspirations(List<String> inspirations) {
        this.inspirations = inspirations;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

}
