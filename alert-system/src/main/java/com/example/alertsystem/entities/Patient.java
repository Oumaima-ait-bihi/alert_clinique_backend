package com.example.alertsystem.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private int age;
    private String adresse;

    @OneToMany(mappedBy = "patient")
    private List<RythmeCardiaque> rythmeCardiaques;

    @OneToMany(mappedBy = "patient")
    private List<QualiteSommeil> qualiteSommeils;

    @OneToMany(mappedBy = "patient")
    private List<Humeur> humeurs;

    @OneToMany(mappedBy = "patient")
    private List<Alerte> alertes;

    @OneToMany(mappedBy = "patient")
    private List<HistoriqueAlerte> historiqueAlertes;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getAdresse() { return adresse; }
    public void setAdresse(String adresse) { this.adresse = adresse; }

    public List<RythmeCardiaque> getRythmeCardiaques() { return rythmeCardiaques; }
    public void setRythmeCardiaques(List<RythmeCardiaque> rythmeCardiaques) { this.rythmeCardiaques = rythmeCardiaques; }

    public List<QualiteSommeil> getQualiteSommeils() { return qualiteSommeils; }
    public void setQualiteSommeils(List<QualiteSommeil> qualiteSommeils) { this.qualiteSommeils = qualiteSommeils; }

    public List<Humeur> getHumeurs() { return humeurs; }
    public void setHumeurs(List<Humeur> humeurs) { this.humeurs = humeurs; }

    public List<Alerte> getAlertes() { return alertes; }
    public void setAlertes(List<Alerte> alertes) { this.alertes = alertes; }

    public List<HistoriqueAlerte> getHistoriqueAlertes() { return historiqueAlertes; }
    public void setHistoriqueAlertes(List<HistoriqueAlerte> historiqueAlertes) { this.historiqueAlertes = historiqueAlertes; }
}
