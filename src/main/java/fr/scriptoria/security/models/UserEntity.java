package fr.scriptoria.security.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateurs")
public class UserEntity {

    // attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String email;

    private String nickName;

    private String password;

    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    // constructors

    public UserEntity() {
    }

    public UserEntity(Long userId, String nom, String nickName, String email, String password, RoleEnum role) {
        this.userId = userId;
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // getters and setters

    public Long getUserId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    // toString method
    @Override
    public String toString() {
        return "Utilisateur [userId=" + userId + ", pseudonyme=" + nickName + ", email=" + email
                + ", motdepasse=" + password + ", role=" + role + "]";
    }

}
