package com.example.BDSpringSD.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "propietarios")
public class Propietario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String direccion;

    private String telefono;
}