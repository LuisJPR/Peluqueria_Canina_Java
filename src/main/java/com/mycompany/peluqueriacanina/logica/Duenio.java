package com.mycompany.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Cuando se nombra una clase como entidad, significa que se transformara en una tabla en la BD.
public class Duenio implements Serializable {
    //Atributos
    @Id //Marcamos nuestro Id como llave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE) //Indicamos como se va a generar el valor de la llave primaria
    private int id_duenio;
    private String nombre;
    private String celDuenio;
    
    //Metodos constructor sin parametros
    public Duenio() {
    }
    
    //Metodos constructor con parametros
    public Duenio(int id_duenio, String nombre, String celDuenio) {
        this.id_duenio = id_duenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }
    
    //Metodos Get y Set
    public int getId_duenio() {
        return id_duenio;
    }
    public void setId_duenio(int id_duenio) {
        this.id_duenio = id_duenio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }
    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
}