package com.example.brief6.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "referenciel", catalog = "skillstree")
public class Referenciel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_referenciel")
    private int id_referenciel;

    @Basic
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "referenciel", fetch = FetchType.EAGER)
    private List<Competence> competences;


    public int getId_referenciel() {
        return id_referenciel;
    }

    public void setId_referenciel(int id_referenciel) {
        this.id_referenciel = id_referenciel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }
}