package com.gestion.incidencias.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Calendar;

@Entity
@Table(name = "incidencias")
public class Incidencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombreOperador;
    private String status;


    private String creationDate;

    public Incidencias() {
        super();
    }

    public Incidencias(Integer id, String nombreOperador, String status, String creationDate) {
        super();
        this.id = id;
        this.nombreOperador = nombreOperador;
        this.status = status;
        this.creationDate = creationDate;
    }

    public Incidencias(String nombreOperador, String status, String creationDate) {
        super();
        this.nombreOperador = nombreOperador;
        this.status = status;
        this.creationDate = creationDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getnombreOperador() {
        return nombreOperador;
    }

    public void setnombreOperador(String nombreOperador) {
        this.nombreOperador = nombreOperador;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Incidencias{" +
                "id=" + id +
                ", nombreOperador='" + nombreOperador + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
