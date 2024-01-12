package com.example.labxpert.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class reactif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String description;
    private int quantiteStock;
    private Date dateExperation;
    private String fournissuer;

    @ManyToOne
    private analyse analyse;

}
