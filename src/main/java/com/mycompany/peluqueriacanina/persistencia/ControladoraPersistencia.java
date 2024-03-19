package com.mycompany.peluqueriacanina.persistencia;

import com.mycompany.peluqueriacanina.logica.Duenio;
import com.mycompany.peluqueriacanina.logica.Mascota;
import com.mycompany.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    //Creamos una instancia de DuenioJpaController
    DuenioJpaController duenioJpa = new DuenioJpaController();
    
    //Creamos una instancia de MascotaJpaController
    MascotaJpaController mascoJpa = new MascotaJpaController();

    //*** Metodo para guardar Mascota y Dueño ***
    public void guardar(Duenio duenio, Mascota masco) {
        //Crear en la BD el duenio
        duenioJpa.create(duenio);
        
        //Crear en al BD la mascota
        mascoJpa.create(masco);
    }

    //*** Metodo para listar las mascotas en la tabla ***
    public List<Mascota> traerMascotas() {
        return mascoJpa.findMascotaEntities();
    }

    //*** Metodo para borrar mascota ***
    public void borrarMascota(int num_cliente) {
        try {
            mascoJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        return mascoJpa.findMascota(num_cliente);
    }

    //*** Metodo para modificar mascota ***
    public void modificarMascota(Mascota masco) {
        try {
            mascoJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return duenioJpa.findDuenio(id_duenio);
    }

    //*** Metodo para modificar dueño ***
    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}