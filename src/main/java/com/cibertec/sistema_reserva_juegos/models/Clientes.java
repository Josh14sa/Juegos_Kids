package com.cibertec.sistema_reserva_juegos.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Cliente")
@Table(name = "clientes")

public class Clientes {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Email")
    private String email;

    @Column(name = "Dni")
    private String dni;

    @Column(name = "Telefono")
    private String telefono;

    @Column(name = "Direccion")
    private String direccion;
}
