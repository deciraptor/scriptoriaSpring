// package fr.scriptoria.security.models;

// import java.util.ArrayList;
// import java.util.List;

// import jakarta.persistence.*;

// @Entity
// @Table(name = "users")
// public class UserEntity {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)

//     private Integer id;
//     private String username;
//     private String password;

//     @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//     @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
//     inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
//     private List<Role> roles = new ArrayList<>();

//     public Integer getId() {
//         return id;
//     }

//     public void setId(Integer id) {
//         this.id = id;
//     }

//     public UserEntity() {
//     }

//     public String getUsername() {
//         return username;
//     }

//     public UserEntity(String username, String password) {
//         this.username = username;
//         this.password = password;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     public List<Role> getRoles() {
//         return roles;
//     }

//     public void setRoles(List<Role> roles) {
//         this.roles = roles;
//     }
    
// }
