package com.cibertec.sistema_reserva_juegos.service;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Empleado;
import com.cibertec.sistema_reserva_juegos.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    // Listado de empleados
    public List<Empleado> listarEmpleados() {
        return empleadoRepository.findAll();
    }
    // Guardar y Actualizar
    public void grabar(Empleado bean) {
        empleadoRepository.save(bean);
    }
    // Buscar
    public Empleado buscar(Integer empleadoId) {
        return empleadoRepository.findById(empleadoId).orElse(null);
    }
    // Eliminar
    public void eliminar(Integer empleadoId) {
        empleadoRepository.deleteById(empleadoId);
    }

    // Buscar empleados en la transaccion
    public List<Empleado> listarEmpleadoXApellido(String apellido){
        return empleadoRepository.listApellidoEmpleado(apellido);
    }

    // Actualizar un empleado
    public List<Empleado> grabarEmpleado(Empleado empleado) {
        System.out.println("Grabando empleado");
        empleadoRepository.save(empleado);
        return empleadoRepository.findAll();
    }
}
