package com.gestion.incidencias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "operador")
public class Operador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOperador;

    @Column(name = "nombre", length = 255, nullable =false)
    private String nameOperador;

    @Column(name = "email", length = 255, nullable =false)
    private String emailOperador;

    public Operador() {
    }

    public Operador(Integer idOperador, String nameOperador, String emailOperador) {
        this.idOperador = idOperador;
        this.nameOperador = nameOperador;
        this.emailOperador = emailOperador;
    }
    public Operador(String nameOperador, String emailOperador) {
        this.nameOperador = nameOperador;
        this.emailOperador = emailOperador;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public String getNameOperador() {
        return nameOperador;
    }

    public void setNameOperador(String nameOperador) {
        this.nameOperador = nameOperador;
    }

    public String getEmailOperador() {
        return emailOperador;
    }

    public void setEmailOperador(String emailOperador) {
        this.emailOperador = emailOperador;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "idOperador=" + idOperador +
                ", nameOperador='" + nameOperador + '\'' +
                ", emailOperador='" + emailOperador + '\'' +
                '}';
    }
}
