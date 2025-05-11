package com.hospital_vm.cl.hospital_mv.controller;

import com.hospital_vm.cl.hospital_mv.model.Paciente;
import com.hospital_vm.cl.hospital_mv.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteController {

    @Autowired
    private PacienteService pacienteService;

    @GetMapping
    public ResponseEntity<List<Paciente>> listar() {
        List<Paciente> pacientes = pacienteService.findAll();
        if (pacientes.isEmpty()) {
            return ResponseEntity.noContent().build();  
            // otra alternativa es return new ResponseEntity.<>(HttpStatus.NOT_CONTENT);
          
        }
        return ResponseEntity.ok(pacientes);
        // otra alternativa es return new ResponseEntity<>(pacientes, HttpStatus.OK);
        
    }
}
