package com.example.BDSpringSD.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "mascotas")
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String especie;

    private String raza;

    @Column(name = "fecha_nacimiento")
    private String fechaNacimiento;

    @ManyToOne
    @JoinColumn(name = "propietario_id", nullable = false)
    private Propietario propietario;
}