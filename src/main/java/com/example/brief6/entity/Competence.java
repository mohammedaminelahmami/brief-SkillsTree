package com.example.brief6.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "competence", catalog = "skillstree")
public class Competence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competence")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_referenciel", referencedColumnName = "id")
    private Referenciel referenciel;
}