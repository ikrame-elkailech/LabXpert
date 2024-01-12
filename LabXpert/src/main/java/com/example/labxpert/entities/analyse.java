package com.example.labxpert.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class analyse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private  utilisateur utilisateur;
    private Date dateDebut;
    private Date dateFin;
    private String commantaire;

    @ManyToOne
    private patient patient;

    @ManyToOne
    private echantillon echantillon;
    @OneToOne
    private resultat resultat;
    @OneToMany
    private List<analyse> analyseList;
    @ManyToOne
    private planification planification;

}
