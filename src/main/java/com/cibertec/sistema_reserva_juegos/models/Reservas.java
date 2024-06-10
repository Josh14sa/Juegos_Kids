package com.cibertec.sistema_reserva_juegos.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Reserva")
@Table(name = "reservas")
public class Reservas {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReseva;

    @Column(name = "FechaReserva")
    private Date fechaReserva;

    @Column(name = "FechaInicio")
    private Date fechaInicio;

    @Column(name = "FechaFin")
    private Date fechaFin;

    @Column(name = "DuracionReserva")
    private double duracionReserva;

    @Column(name = "CantidadNinos")
    private int cantidadNinos;

    @Column(name = "CantidadAdultos")
    private int cantidadAdultos;

    @ManyToOne
    @JoinColumn(name = "id_cliente") private Clientes reservaCliente;

    /*@ManyToOne
    @JoinColumn(name = "id_empleado") private Empleados reservaEmpleado;

    @ManyToOne
    @JoinColumn(name = "id_tarifa") private Tarifas reservaTarifa;*/

}
