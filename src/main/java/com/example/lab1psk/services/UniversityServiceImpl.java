package com.example.lab1psk.services;

import com.example.lab1psk.entities.Student;
import com.example.lab1psk.entities.University;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class UniversityServiceImpl implements UniversityService {

    @Inject
    private EntityManager em;

    public void saveUniversity(University university) {
        this.em.persist(university);
    }

    public List<University> getAllUniversities() {
        return this.em.createNamedQuery("University.findAll", University.class).getResultList();
    }

    public University getUniversityById(long id) {

        return em.find(University.class, id);
    }

    public void updateUniversity(University university) {
        this.em.merge(university);
    }

    @Override
    public void deleteUniversityById(long id) {
        University u = em.find(University.class, id);
        em.remove(u);
    }
}