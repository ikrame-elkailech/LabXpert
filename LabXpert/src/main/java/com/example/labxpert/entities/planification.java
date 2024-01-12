package com.example.labxpert.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class planification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    private Date dateDebut;
    private Date dateFin;
    @ManyToOne
    private  utilisateur technicien;
    @OneToMany
    private List<analyse> analyseList;

}
