package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.models.Salas;
import com.cibertec.sistema_reserva_juegos.models.Tarifa;
import com.cibertec.sistema_reserva_juegos.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifaService {

    @Autowired
    private TarifaRepository tarifaRepository;

    // Listado de tarifas
    public List<Tarifa> listarTarifas() {
        return tarifaRepository.findAll();
    }
    // Guardar y Actualizar
    public void grabar(Tarifa bean) {
        tarifaRepository.save(bean);
    }

    // Buscar
    public Tarifa buscar(Integer taridaId) {
        return tarifaRepository.findById(taridaId).orElse(null);
    }

    // Eliminar
    public void eliminar(Integer taridaId) {
        tarifaRepository.deleteById(taridaId);
    }

    // Actualizar una tarifa
    public List<Tarifa> grabarTarifa(Tarifa tarifa) {
        System.out.println("Grabando tarifa");
        tarifaRepository.save(tarifa);
        return tarifaRepository.findAll();
    }
}
