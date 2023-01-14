package com.gestion.incidencias.controller;

import com.gestion.incidencias.model.Operador;
import com.gestion.incidencias.service.OperadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OperadorController {

    @Autowired
    private OperadorServicio serviceOperador;

    @GetMapping("/operadores")
    public List<Operador> listarOperadores() {
        return serviceOperador.listarOperadores();
    }

    @GetMapping("/operadores/{id}")
    public Operador getOperadorById(Integer id) {
        return serviceOperador.listarOperadorById(id);
    }
}
