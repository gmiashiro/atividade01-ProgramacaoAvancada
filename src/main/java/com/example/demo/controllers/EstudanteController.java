package com.example.demo.controllers;

import com.example.demo.models.EstudanteModel;
import com.example.demo.repositories.EstudanteRepository;
import com.example.demo.services.EstudanteService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @GetMapping
    public List<EstudanteModel> findAll(){
        return estudanteService.findAll();
    }

    @GetMapping("/{id}")
    public EstudanteModel findById(@PathVariable("id") Long id){
        return estudanteService.findById(id);
    }

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudante){
        return estudanteService.criarEstudante(estudante);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        estudanteService.deleteById(id);
    }
}
