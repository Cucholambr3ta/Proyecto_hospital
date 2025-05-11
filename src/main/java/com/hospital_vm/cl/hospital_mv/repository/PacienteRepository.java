package com.hospital_vm.cl.hospital_mv.repository;


import com.hospital_vm.cl.hospital_mv.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    // Encuentra pacientes por apellidos
    List<Paciente> find By Apellidos(String apellidos);
    // Encuentra pacientes por correo electronico
    Paciente findByCorreo(String correo);
    // Encuentra pacientes por nombre y apellido
    Listi<Paciente> findByNombreAndApellidos(String nombre, String apellidos);

}
