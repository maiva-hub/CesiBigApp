package com.cesi.business.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "students")

public class Student {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id" )
    private Long studentId;

    @Column (name = "firstname" )
    private String firstname;

    @Column (name = "lastname" )
    private String lastname;

    @Column (name = "email" )
    private String email;
    @Column (name = "password" )
    private String password;

    public Long getStudentId() {
        return studentId;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstname() {
        return firstname;

    }
    public String getLastname() {
        return lastname;

    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
}
