package com.atexo;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@ApplicationScoped
public class Inscrits {
    private List<Personne> listeInscrits = new ArrayList<>();

    public void ajouterInscrit(String nom, String prenom, String date, String id) {
        Personne personne = new Personne(nom, prenom, date, id);
        listeInscrits.add(personne);
    }
}