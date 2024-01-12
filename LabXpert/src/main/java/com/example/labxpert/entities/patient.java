package com.example.labxpert.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String sexe;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "patient")
    private List<analyse> analyses;

    @OneToMany
    private List<echantillon> echantillonList;




}
