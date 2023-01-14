package com.gestion.incidencias.service;

import com.gestion.incidencias.model.Operador;
import com.gestion.incidencias.repository.OperadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperadorServicio {

    @Autowired
    private OperadorRepository repository;

    public List<Operador> listarOperadores() {
        return repository.findAll();
    }

    public Operador listarOperadorById(Integer id) {
        return repository.findById(id).get();
    }
}
