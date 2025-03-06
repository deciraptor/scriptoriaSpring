package fr.scriptoria.models.entities;

import java.time.LocalDateTime;
import java.util.List;

import fr.scriptoria.models.enumeration.TypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Projets")
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;
    private String subTitle;
    @Enumerated(EnumType.STRING)
    private TypeEnum type;
    private String description;
    private LocalDateTime dateCreation;
    private List<String> livres;
    private List<String> notes;
    private List<String> inspirations;
    private List<String> personnages;

    public ProjectEntity() {
    }

    public ProjectEntity(String id, String title, String subTitle, TypeEnum type, String description,
            LocalDateTime dateCreation, List<String> livres, List<String> notes, List<String> inspirations,
            List<String> personnages) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.type = type;
        this.description = description;
        this.dateCreation = dateCreation;
        this.livres = livres;
        this.notes = notes;
        this.inspirations = inspirations;
        this.personnages = personnages;
    }

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

    public List<String> getLivres() {
        return livres;
    }

    public void setLivres(List<String> livres) {
        this.livres = livres;
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

    public List<String> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<String> personnages) {
        this.personnages = personnages;
    }

}
