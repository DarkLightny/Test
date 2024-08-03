package com.atexo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Personne {
    private String nom;
    private String prenom;
    private String date;
    private String id;

    public Personne(String nom, String prenom, String date, String id) {
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.id = id;
    }
}
