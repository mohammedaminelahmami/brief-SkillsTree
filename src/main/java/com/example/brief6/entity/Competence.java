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

    @Basic
    @Column(name = "referenciel_id", insertable = false, updatable = false)
    private int referenciel_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "referenciel_id",referencedColumnName = "id_referenciel")
    private Referenciel referenciel;

    public Competence() {
    }

    public int getId_competence() {
        return this.id_competence;
    }

    public String getName() {
        return this.name;
    }

    public int getReferenciel_id() {
        return this.referenciel_id;
    }

    public Referenciel getReferenciel() {
        return this.referenciel;
    }

    public void setId_competence(int id_competence) {
        this.id_competence = id_competence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReferenciel_id(int referenciel_id) {
        this.referenciel_id = referenciel_id;
    }

    public void setReferenciel(Referenciel referenciel) {
        this.referenciel = referenciel;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Competence)) return false;
        final Competence other = (Competence) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId_competence() != other.getId_competence()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        if (this.getReferenciel_id() != other.getReferenciel_id()) return false;
        final Object this$referenciel = this.getReferenciel();
        final Object other$referenciel = other.getReferenciel();
        if (this$referenciel == null ? other$referenciel != null : !this$referenciel.equals(other$referenciel))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Competence;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId_competence();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        result = result * PRIME + this.getReferenciel_id();
        final Object $referenciel = this.getReferenciel();
        result = result * PRIME + ($referenciel == null ? 43 : $referenciel.hashCode());
        return result;
    }

    public String toString() {
        return "Competence(id_competence=" + this.getId_competence() + ", name=" + this.getName() + ", referenciel_id=" + this.getReferenciel_id() + ", referenciel=" + this.getReferenciel() + ")";
    }
}