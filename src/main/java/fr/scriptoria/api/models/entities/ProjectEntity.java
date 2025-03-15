package fr.scriptoria.api.models.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import fr.scriptoria.login.models.User;
import fr.scriptoria.api.models.enumeration.TypeEnum;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    // table attributes ManyToOne

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    // table attributes OneToMany

    @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<NoteEntity> notes = new ArrayList<>();

    // @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // private List<BookDocument> books = new ArrayList<>();

    // @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch =
    // FetchType.EAGER)
    // private List<InspirationEntity> inspirations = new ArrayList<>();

    // @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch =
    // FetchType.EAGER)
    // private List<CharacterDocument> characters = new ArrayList<>();

    // constructors

    public ProjectEntity() {
    }

    public ProjectEntity(Long projectId, String title, String subTitle, TypeEnum typeProject, String description,
            LocalDateTime dateCreation, User user, List<NoteEntity> notes) {
        this.projectId = projectId;
        this.title = title;
        this.subTitle = subTitle;
        this.typeProject = typeProject;
        this.description = description;
        this.dateCreation = dateCreation;
        this.user = user;
        this.notes = notes;
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

    public User getUserEntity() {
        return user;
    }

    public void setUserEntity(User user) {
        this.user = user;
    }

    public List<NoteEntity> getNotes() {
        return notes;
    }

    public void setNotes(List<NoteEntity> notes) {
        this.notes = notes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
