package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Tarifa;
import com.cibertec.sistema_reserva_juegos.service.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "http://localhost:4200")
public class TarifaController {

    @Autowired
    private TarifaService tarifaService;

    @GetMapping("/tarifas")
    public List<Tarifa> getTarifas() {
        return tarifaService.listarTarifas();
    }

    @GetMapping("/tarifas/{tarifaId}")
    public Tarifa getTarifas(@PathVariable("tarifaId") int tarifaId) {
        System.out.println("Obteniendo tarifa: " + tarifaId);
        return tarifaService.buscar(tarifaId);
    }

    @PostMapping("/tarifas")
    public List<Tarifa> grabarTarifas(@RequestBody Tarifa tarifa) {
        System.out.println("Grabando tarifa");
        return tarifaService.grabarTarifa(tarifa);
    }

    @DeleteMapping("/tarifas/{tarifaId}")
    public List<Tarifa> deleteTarifa(@PathVariable("tarifaId") int tarifaId) {
        System.out.println("Eliminando tarifa");
        tarifaService.eliminar(tarifaId);
        return tarifaService.listarTarifas();
    }
}
