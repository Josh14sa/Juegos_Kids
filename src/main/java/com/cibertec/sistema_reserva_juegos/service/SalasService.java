package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Salas;
import com.cibertec.sistema_reserva_juegos.repository.SalasRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalasService {

    @Autowired
    private SalasRespository salasRespository;

    // Listado de salas
    public List<Salas> listarSalas() {
        return salasRespository.findAll();
    }
    // Guardar y Actualizar
    public void grabar(Salas bean) {
        salasRespository.save(bean);
    }

    // Buscar
    public Salas buscar(Integer salaId) {
        return salasRespository.findById(salaId).orElse(null);
    }

    // Eliminar
    public void eliminar(Integer salaId) {
        salasRespository.deleteById(salaId);
    }

    // Actualizar una sala
    public List<Salas> grabarSala(Salas salas) {
        System.out.println("Grabando salas");
        salasRespository.save(salas);
        return salasRespository.findAll();
    }
}
