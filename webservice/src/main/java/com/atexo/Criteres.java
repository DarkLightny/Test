package com.atexo;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApplicationScoped
public class Criteres {
    public String nom;
    public String prenom;
    public String date;
}
