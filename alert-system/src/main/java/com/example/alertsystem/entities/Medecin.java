package com.example.alertsystem.entities;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String specialite;

    @OneToMany(mappedBy = "medecin")
    private List<Alerte> alertes;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getSpecialite() { return specialite; }
    public void setSpecialite(String specialite) { this.specialite = specialite; }

    public List<Alerte> getAlertes() { return alertes; }
    public void setAlertes(List<Alerte> alertes) { this.alertes = alertes; }
}
