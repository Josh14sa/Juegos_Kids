package com.cibertec.sistema_reserva_juegos.controller;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import com.cibertec.sistema_reserva_juegos.models.Empleado;
import com.cibertec.sistema_reserva_juegos.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consultas")
@CrossOrigin(origins = "http://localhost:4200")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados() {
        return empleadoService.listarEmpleados();
    }

    @GetMapping("/empleados/{empleadoId}")
    public Empleado getEmpleados(@PathVariable("empleadoId") int empleadoId) {
        System.out.println("Obteniendo empleado: " + empleadoId);
        return empleadoService.buscar(empleadoId);
    }
    @PostMapping("/empleados")
    public List<Empleado> grabarEmpleado(@RequestBody Empleado empleado) {
        System.out.println("Grabando empleado");
        return empleadoService.grabarEmpleado(empleado);
    }

    /*@PostMapping("/empleados")
    public List<Empleado> grabarEmpleado(@RequestBody Empleado empleado) {
        System.out.println("Grabando empleado");
        return empleadoService.grabarEmpleado(empleado);
    }*/

    @DeleteMapping("/empleados/{empleadoId}")
    public List<Empleado> deleteEmpleado(@PathVariable("empleadoId") int empleadoId) {
        System.out.println("Eliminando empleado");
        empleadoService.eliminar(empleadoId);
        return empleadoService.listarEmpleados();
    }

    @GetMapping("/empleadoApellido")
    public List<Empleado> listarClientesApellido(@RequestParam("apellido") String apellido){
        List<Empleado> data = empleadoService.listarEmpleadoXApellido(apellido+"%");
        return data;
    }
}
