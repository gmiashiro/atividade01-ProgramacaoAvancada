package com.example.demo.controllers;

import com.example.demo.models.EstudanteModel;
import com.example.demo.repositories.EstudanteRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteRepository estudanteRepository;

    @GetMapping
    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    @PostMapping
    public EstudanteModel save(@RequestBody EstudanteModel estudante){
        return estudanteRepository.save(estudante);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        estudanteRepository.deleteById(id);
    }
}
