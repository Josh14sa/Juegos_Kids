package com.cibertec.sistema_reserva_juegos.controller;


import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Salas;
import com.cibertec.sistema_reserva_juegos.service.ClienteService;
import com.cibertec.sistema_reserva_juegos.service.SalasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "http://localhost:4200")
public class SalasController {

    @Autowired
    private SalasService salasService;

    @GetMapping("/salas")
    public List<Salas> getClientes() {
        return salasService.listarSalas();
    }
}
