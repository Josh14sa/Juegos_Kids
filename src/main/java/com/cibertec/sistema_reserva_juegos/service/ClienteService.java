package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepo;

    // Listado de clientes
    public List<Clientes> listarClientes() {
        return clienteRepo.findAll();
    }
    // Guardar y Actualizar
    public void grabar(Clientes bean) {
        clienteRepo.save(bean);
    }
    // Buscar
    public Clientes buscar(Integer clienteId) {
        return clienteRepo.findById(clienteId).orElse(null);
    }
    // Eliminar
    public void eliminar(Integer clienteId) {
        clienteRepo.deleteById(clienteId);
    }
    // Buscar clientes en la transaccion
    public List<Clientes> listarClienteXApellido(String apellido){
        return clienteRepo.listApellidoCliente(apellido);
    }
    // Actualizar un cliente
    public List<Clientes> grabarCliente(Clientes clientes) {
        System.out.println("Grabando cliente");
        clienteRepo.save(clientes);
        return clienteRepo.findAll();
    }
}
