package com.example.brief6.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    private List<Competence> competences = new ArrayList<>();

    public Referenciel() {
    }

    public int getId_referenciel() {
        return this.id_referenciel;
    }

    public String getName() {
        return this.name;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setId_referenciel(int id_referenciel) {
        this.id_referenciel = id_referenciel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Referenciel)) return false;
        final Referenciel other = (Referenciel) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId_referenciel() != other.getId_referenciel()) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$competences = this.getCompetences();
        final Object other$competences = other.getCompetences();
        if (this$competences == null ? other$competences != null : !this$competences.equals(other$competences))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Referenciel;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getId_referenciel();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $competences = this.getCompetences();
        result = result * PRIME + ($competences == null ? 43 : $competences.hashCode());
        return result;
    }

    public String toString() {
        return "Referenciel(id_referenciel=" + this.getId_referenciel() + ", name=" + this.getName() + ", competences=" + this.getCompetences() + ")";
    }
}