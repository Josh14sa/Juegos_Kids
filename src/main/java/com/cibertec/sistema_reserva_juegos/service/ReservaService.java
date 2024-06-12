package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.models.Empleado;
import com.cibertec.sistema_reserva_juegos.models.Reservas;
import com.cibertec.sistema_reserva_juegos.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    // Listado de reservas
    public List<Reservas> listarReservas() {
        return reservaRepository.findAll();
    }
    // Guardar y Actualizar
    public void grabar(Reservas bean) {
        reservaRepository.save(bean);
    }
    // Buscar
    public Reservas buscar(Integer reservaId) {
        return reservaRepository.findById(reservaId).orElse(null);
    }
    // Eliminar
    public void eliminar(Integer reservaId) {
        reservaRepository.deleteById(reservaId);
    }

    // Actualizar una reserva
    public List<Reservas> grabarReserva(Reservas reservas) {
        System.out.println("Grabando reservas");
        reservaRepository.save(reservas);
        return reservaRepository.findAll();
    }
}
