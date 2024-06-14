package com.cibertec.sistema_reserva_juegos.controller;


import com.cibertec.sistema_reserva_juegos.models.Rol;
import com.cibertec.sistema_reserva_juegos.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "http://localhost:4200")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("/roles")
    public List<Rol> listarRoles() {
        return rolService.listarRoles();
    }
}
