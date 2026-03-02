package com.example.demo.services;

import com.example.demo.models.EstudanteModel;
import com.example.demo.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudante){
        return estudanteRepository.save(estudante);
    }

    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    public EstudanteModel findById(Long id){
        return estudanteRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id){
        estudanteRepository.deleteById(id);
    }
}
