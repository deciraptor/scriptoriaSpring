package fr.scriptoria.models.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import fr.scriptoria.models.enumeration.TypeEnum;
import fr.scriptoria.security.models.UserEntity;
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

    // table attributes ManyToOne

    @ManyToOne
    @JoinColumn(name = "user_entity_id", referencedColumnName = "userEntityId")
    private UserEntity userEntity;

    // table attributes OneToMany

    // @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // private List<NoteEntity> notes = new ArrayList<>();

    // @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // private List<InspirationEntity> inspirations = new ArrayList<>();

    // @OneToMany(mappedBy = "projectEntity", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // private List<CharacterEntity> characters = new ArrayList<>();

    // constructors

    public ProjectEntity() {
    }

    public ProjectEntity(Long projectId, String title, String subTitle, TypeEnum typeProject, String description,
            LocalDateTime dateCreation, String bookId, UserEntity userEntity) {
        this.projectId = projectId;
        this.title = title;
        this.subTitle = subTitle;
        this.typeProject = typeProject;
        this.description = description;
        this.dateCreation = dateCreation;
        this.userEntity = userEntity;
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


    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    // toString method

    @Override
    public String toString() {
        return "ProjectEntity [projectId=" + projectId + ", title=" + title + ", subTitle=" + subTitle
                + ", typeProject=" + typeProject + ", description=" + description + ", dateCreation=" + dateCreation
                + ", userEntity=" + userEntity + "]";
    }

}
