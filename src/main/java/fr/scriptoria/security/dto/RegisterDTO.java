package fr.scriptoria.security.dto;

import fr.scriptoria.security.models.RoleEnum;

public class RegisterDTO {

    private String email;
    private String nickName;
    private String password;
    private RoleEnum role;

    public RegisterDTO() {
    }

    public RegisterDTO(String email, String nickName, String password, RoleEnum role) {
        this.email = email;
        this.nickName = nickName;
        this.password = password;
        this.role = role;
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

}
