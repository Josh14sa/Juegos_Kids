package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public List<Clientes> getClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/clientes/{clienteId}")
    public Clientes getClientes(@PathVariable("clienteId") int clienteId) {
        System.out.println("Obteniendo cliente: " + clienteId);
        return clienteService.buscar(clienteId);
    }
    @PostMapping("/clientes")
    public List<Clientes> grabarCliente(@RequestBody Clientes cliente) {
        System.out.println("Grabando cliente");
        return clienteService.grabarCliente(cliente);
    }

    @DeleteMapping("/clientes/{clienteId}")
    public List<Clientes> deleteCliente(@PathVariable("clienteId") int clienteId) {
        System.out.println("Eliminando cliente");
        clienteService.eliminar(clienteId);
        return clienteService.listarClientes();
    }

    @GetMapping("/clientesApellido")
    public List<Clientes> listarClientesApellido(@RequestParam("apellido") String apellido){
        List<Clientes> data = clienteService.listarClienteXApellido(apellido+"%");
        return data;
    }
}
