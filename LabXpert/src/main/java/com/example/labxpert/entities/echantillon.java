package com.example.labxpert.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class echantillon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String typeAnalyse;
    private Date datePrelevement;
    private statusEchantillon statut;
    public enum statusEchantillon {
        normal,
        anormal;

    }

    @ManyToOne
    private patient patient;
    @OneToMany(mappedBy = "echs")
    private List<analyse> analyses;

}
