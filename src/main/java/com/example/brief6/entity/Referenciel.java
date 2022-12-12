package com.example.brief6.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "referenciel", catalog = "skillstree")
public class Referenciel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
        name = "table_apprenant_referenciel_assoc",
        joinColumns = @JoinColumn(name = "id_referenciel"),
        inverseJoinColumns = @JoinColumn(name = "id_apprenant")
    )
    private List<Apprenant> apprenants;

    @OneToMany(mappedBy = "referenciel")
    private List<Competence> competences;
}