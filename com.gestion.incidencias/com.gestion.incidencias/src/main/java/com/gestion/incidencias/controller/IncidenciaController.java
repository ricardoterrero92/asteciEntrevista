package com.gestion.incidencias.controller;

import com.gestion.incidencias.model.Incidencias;
import com.gestion.incidencias.service.IncidenciaService;
import com.gestion.incidencias.service.OperadorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncidenciaController {

    @Autowired
    private IncidenciaService service;

    @GetMapping({"/incidencias", "/"})
    public List<Incidencias> listarIncidencias() {
        return service.listarIncidencias();
    }

    @GetMapping("/incidencias/{id}")
    public Incidencias listarIncidenciaPorId(@PathVariable Integer id) {
        return service.obtenerIncidenciaPorId(id);
    }

    @PostMapping("/incidencias")
    public void guardarIncidencias(@RequestBody Incidencias incidencia) {
        service.guardarIncidencias(incidencia);
    }

    @PutMapping("/incidencias/{id}")
    public ResponseEntity<Incidencias> actualizarIncidencias(@RequestBody Incidencias incidencia, @PathVariable Integer id) {
        try {
            Incidencias incidenciaActual = service.obtenerIncidenciaPorId(id);

            incidenciaActual.setnombreOperador(incidencia.getnombreOperador());
            incidenciaActual.setStatus(incidencia.getStatus());

            service.guardarIncidencias(incidenciaActual);
            return new ResponseEntity<Incidencias>(incidenciaActual, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Incidencias>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/incidencias/{id}")
    public void eliminarIncidencia(@PathVariable Integer id) {
        service.eliminarIncidenciaPorId(id);
    }

}
