package com.example.brief6.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "competence")
public class Competence {
    private enum niveau {nothing, niveau1, niveau2, niveau3}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "niveau")
    private niveau niveau;

    @ManyToOne
    @JoinColumn(name = "id_referenciel", referencedColumnName = "id")
    private Referenciel referenciel;
}