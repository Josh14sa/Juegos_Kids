package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Rol;
import com.cibertec.sistema_reserva_juegos.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    // Listado de roles
    public List<Rol> listarRoles() {
        return rolRepository.findAll();
    }
    // Guardar y Actualizar
    public void grabar(Rol bean) {
        rolRepository.save(bean);
    }
    // Buscar
    public Rol buscar(Integer rolId) {
        return rolRepository.findById(rolId).orElse(null);
    }
    // Eliminar
    public void eliminar(Integer rolId) {
        rolRepository.deleteById(rolId);
    }

    // Actualizar un roles
    public List<Rol> grabarRol(Rol rol) {
        System.out.println("Grabando rol");
        rolRepository.save(rol);
        return rolRepository.findAll();
    }
}
