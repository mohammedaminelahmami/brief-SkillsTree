package com.example.brief6.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "competence", catalog = "skillstree")
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competence")
    private int id_competence;

    @Basic
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_referenciel", insertable = false, updatable = false)
    private Referenciel referenciel;

    public int getId_competence() {
        return id_competence;
    }

    public void setId_competence(int id_competence) {
        this.id_competence = id_competence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Referenciel getReferenciel() {
        return referenciel;
    }

    public void setReferenciel(Referenciel referenciel) {
        this.referenciel = referenciel;
    }

    @Override
    public String toString() {
        return "Competence{" +
                "id_competence=" + id_competence +
                ", name='" + name + '\'' +
                '}';
    }
}