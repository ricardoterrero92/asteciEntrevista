package com.gestion.incidencias.service;

import com.gestion.incidencias.model.Incidencias;
import com.gestion.incidencias.repository.IncidenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidenciaService {

    @Autowired
    private IncidenciaRepository repository;

    public List<Incidencias> listarIncidencias () {
        return repository.findAll();
    }

    public void guardarIncidencias (Incidencias incidencia) {
        repository.save(incidencia);
    }

    public Incidencias obtenerIncidenciaPorId(Integer id) {
        return repository.findById(id).get();
    }

    public void eliminarIncidenciaPorId(Integer id) {
        repository.deleteById(id);
    }

}
