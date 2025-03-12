package fr.scriptoria.api.models.entities;

import fr.scriptoria.api.models.enumeration.GenreEnum;
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
@Table(name = "inspirations")
public class InspirationEntity {

    // simple attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inspirationId;

    private String title;

    @Enumerated(EnumType.STRING)
    private GenreEnum literaryGenre;

    // table attributes ManyToOne

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "projectId")
    private ProjectEntity project;

    // constructors

    public InspirationEntity() {
    }

    public InspirationEntity(Long inspirationId, String title, GenreEnum literaryGenre, ProjectEntity project) {
        this.inspirationId = inspirationId;
        this.title = title;
        this.literaryGenre = literaryGenre;
        this.project = project;
    }

    // getters and setters

    public Long getInspirationId() {
        return inspirationId;
    }

    public void setInspirationId(Long inspirationId) {
        this.inspirationId = inspirationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenreEnum getLiteraryGenre() {
        return literaryGenre;
    }

    public void setLiteraryGenre(GenreEnum literaryGenre) {
        this.literaryGenre = literaryGenre;
    }

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

}
