package com.atexo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ApplicationScoped
public class Concat {
    @Inject
    Criteres criteres;

    private String format_id;
    private String format_nom;
    private String format_prenom;
    private int year;
    private static int counter = 10;

    public void formatId() {
        setFormat_id(String.format("%05d", counter++));
    }

    public void format_nom() {
        int endIndex = Math.min(criteres.getNom().length(), 4);
        setFormat_nom(criteres.getNom().substring(0, endIndex).toUpperCase());
    }

    public void format_prenom() {
        int endIndex = Math.min(criteres.getPrenom().length(), 3);
        setFormat_prenom(criteres.getPrenom().substring(0, endIndex).toUpperCase());
    }

    public void annee() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(criteres.getDate(), formatter);
        year = date.getYear();
    }
    @Override
    public String toString() {
        formatId();
        format_nom();
        format_prenom();
        annee();
        return format_prenom + "-" + format_nom + "_" + year + "C" + format_id;
    }
}
