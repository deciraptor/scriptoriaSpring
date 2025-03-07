package fr.scriptoria.security.models;

import java.util.ArrayList;
import java.util.List;

import fr.scriptoria.models.entities.ProjectEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateurs")
public class UserEntity {

    // simple attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String email;

    private String nickName;

    private String password;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    // table attributes

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProjectEntity> projects = new ArrayList<>();

    // constructors

    public UserEntity() {
    }

    public UserEntity(Long userId, String email, String nickName, String password, RoleEnum role,
            List<ProjectEntity> projects) {
        this.userId = userId;
        this.email = email;
        this.nickName = nickName;
        this.password = password;
        this.role = role;
        this.projects = projects;
    }

    // getters and setters

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public List<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectEntity> projects) {
        this.projects = projects;
    }

}
