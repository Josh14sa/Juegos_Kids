package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Reservas;
import com.cibertec.sistema_reserva_juegos.service.ClienteService;
import com.cibertec.sistema_reserva_juegos.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/reservas")
    public List<Reservas> getReservas() {
        return reservaService.listarReservas();
    }

    @GetMapping("/reservas/{reservaId}")
    public Reservas getReservas(@PathVariable("reservaId") int reservaId) {
        System.out.println("Obteniendo reserva: " + reservaId);
        return reservaService.buscar(reservaId);
    }
    @PostMapping("/reservas")
    public List<Reservas> grabarReservas(@RequestBody Reservas reservas) {
        System.out.println("Grabando cliente");
        return reservaService.grabarReserva(reservas);
    }

    @DeleteMapping("/reservas/{reservaId}")
    public List<Reservas> deleteReserva(@PathVariable("reservaId") int reservaId) {
        System.out.println("Eliminando cliente");
        reservaService.eliminar(reservaId);
        return reservaService.listarReservas();
    }

}
