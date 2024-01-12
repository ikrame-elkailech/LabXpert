package com.example.labxpert.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class rapport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
