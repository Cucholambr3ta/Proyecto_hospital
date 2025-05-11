package com.hospital_vm.cl.hospital_mv.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "paciente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true, lenght = 13, nullable = false)
    private String run;

    @Column(nullable=false)
    private String nombre;

    @Column(nullable=false)
    private String apellido;

    @Column(nullable=true)
    private String fechaNacimiento;

    @Column(nullable=false)
    private String correo;
    
}
