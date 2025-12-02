package com.example.alertsystem.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Admin extends User {

    @OneToMany(mappedBy = "admin")
    private List<Medecin> medecins;

    @OneToMany(mappedBy = "admin")
    private List<Patient> patients;

    // Getters & Setters
    public List<Medecin> getMedecins() { return medecins; }
    public void setMedecins(List<Medecin> medecins) { this.medecins = medecins; }

    public List<Patient> getPatients() { return patients; }
    public void setPatients(List<Patient> patients) { this.patients = patients; }
}
