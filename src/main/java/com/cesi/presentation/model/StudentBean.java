package com.cesi.presentation.model;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import jakarta.faces.context.FacesContext;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author cesi
 */
@Named(value = "studentModel")
@SessionScoped
public class StudentBean implements Serializable {
    private String firstname,lastname,email, password;

    //méthodes d'action
    public String addIdentity(){
        System.out.println(firstname+" "+lastname);
        return "authentication";
    }

    public String addAuthentication(){
        System.out.println(email+" "+password);
        return "summary";
    }

    public String create(){
        System.out.println("création de l'étudiant");
        HttpSession session = (HttpSession)
                FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        session.invalidate();
        return "index"; }

    //getters & setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
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
}
