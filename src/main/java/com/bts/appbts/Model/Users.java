package com.bts.appbts.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class Users {

    @Id
    private int id;
    private String prenom;
    private String email;
    private String password;
    private String role;
    public Users() {

    }

    public Users(String prenom, String email, String password, String role) {
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Users(int  id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
