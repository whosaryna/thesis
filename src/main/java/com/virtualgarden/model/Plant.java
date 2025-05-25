package com.virtualgarden.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;

    private double water;
    private double light;
    private double fertilizer;
    private double health;

    @Column(length = 1000)
    private String lsystem;

    public Plant() {
    }

    public Plant(String species, double water, double light, double fertilizer, double health, String lsystem) {
        this.species = species;
        this.water = water;
        this.light = light;
        this.fertilizer = fertilizer;
        this.health = health;
        this.lsystem = lsystem;
    }
}

