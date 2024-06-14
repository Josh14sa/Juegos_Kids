package com.cibertec.sistema_reserva_juegos.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "nombre_rol")
    private String nombre;

    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Empleado> empleados;
}
