package com.example.alertsystem.service;



import org.springframework.stereotype.Service;
import com.example.alertsystem.repository.MedecinRepository;
import com.example.alertsystem.entities.Medecin;
import java.util.List;
import java.util.Optional;

@Service
public class MedecinService {
    private final MedecinRepository medecinRepository;

    public MedecinService(MedecinRepository medecinRepository) {
        this.medecinRepository = medecinRepository;
    }

    public List<Medecin> getAllMedecins() { return medecinRepository.findAll(); }
    public Optional<Medecin> getMedecinById(Long id) { return medecinRepository.findById(id); }
    public Medecin saveMedecin(Medecin medecin) { return medecinRepository.save(medecin); }
    public void deleteMedecin(Long id) { medecinRepository.deleteById(id); }
}

