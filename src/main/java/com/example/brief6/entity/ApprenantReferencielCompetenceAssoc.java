package com.example.brief6.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "table_apprenant_referenciel_competence_assoc" , catalog = "skillstree")
@IdClass(JoinsIds.class)
public class ApprenantReferencielCompetenceAssoc {
    private enum Niveau {none, niveau1, niveau2, niveau3};

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_apprenant;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_referenciel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_competence;

    @Basic
    @Column(name = "niveau")
    private Niveau niveau;
}
