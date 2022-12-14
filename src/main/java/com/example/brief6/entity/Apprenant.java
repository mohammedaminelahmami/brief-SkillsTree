package com.example.brief6.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Apprenant", catalog = "skillstree")
public class Apprenant extends User{

//    @ManyToMany
//    @JoinTable(
//        name = "table_apprenant_referenciel_competence_assoc",
//        joinColumns = @JoinColumn(name = "id_apprenant"),
//        inverseJoinColumns = @JoinColumn(name = "id_referenciel")
//    )
//    private List<Referenciel> referenciels;
}