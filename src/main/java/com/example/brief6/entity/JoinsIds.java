package com.example.brief6.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;

@MappedSuperclass
public class JoinsIds implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_apprenant;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_referenciel;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_competence;
}
