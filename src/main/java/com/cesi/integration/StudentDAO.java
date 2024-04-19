package com.cesi.integration;

import com.cesi.business.domain.Student;
import jakarta.persistence.*;
import jakarta.ejb.Stateless;

@Stateless
public class StudentDAO {
    @PersistenceContext(unitName = "cesiBigAppPU")
    private  EntityManager em;

    public void insert(Student student){
        em.persist(student);
    }
}
