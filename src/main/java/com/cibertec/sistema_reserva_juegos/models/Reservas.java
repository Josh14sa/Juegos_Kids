package com.cibertec.sistema_reserva_juegos.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Reserva")
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private int idReserva;

    @Column(name = "fecha_reserva")
    private LocalDate fechaReserva;

    @Column(name = "hora_inicio")
    private LocalTime hora_inicio;

    @Column(name = "hora_fin")
    private LocalTime hora_fin;

    @Column(name = "cantidad_personas")
    private int cantidadPersonas;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_cliente") // Nombre de la columna en la tabla Reserva que referencia a Clientes
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Clientes cliente;

    @ManyToOne
    @JoinColumn(name = "id_empleado") // Nombre de la columna en la tabla Reserva que referencia a Empleado
    @JsonBackReference
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "id_sala") // Nombre de la columna en la tabla Reservas que referencia a Salas
    @JsonBackReference
    private Salas sala;// Asegúrate de que coincida con el mappedBy en Clientes

    // Otras propiedades y métodos
}
