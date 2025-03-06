package fr.scriptoria.security.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//attributes
@Entity
@Table(name = "utilisateurs")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String nickName;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleEnum role;

    // constructors
    public UserEntity() {
    }

    public UserEntity(Integer id, String nom, String nickName, String email, String password, RoleEnum role) {
        this.id = id;
        this.nickName = nickName;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    //toString method
    @Override
    public String toString() {
        return "Utilisateur [id=" + id + ", pseudonyme=" + nickName + ", email=" + email
                + ", motdepasse=" + password + ", role=" + role + "]";
    }

}
