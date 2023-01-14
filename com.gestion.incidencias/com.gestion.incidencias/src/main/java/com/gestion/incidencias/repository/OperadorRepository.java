package com.gestion.incidencias.repository;

import com.gestion.incidencias.model.Operador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperadorRepository extends JpaRepository<Operador, Integer> {
}
