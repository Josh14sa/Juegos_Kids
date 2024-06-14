package com.cibertec.sistema_reserva_juegos.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tarifa")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarifa")
    private int idTarifa;

    @Column(name = "precio")
    private double precio;

    @OneToOne
    @MapsId
    @JsonManagedReference
    @JoinColumn(name = "id_tarifa") // Esto asocia directamente con la columna id_tarifa en la tabla Tarifa
    private Reservas reserva; // Asegúrate de que este nombre coincida con el mappedBy en Reservas

    @OneToOne
    @JoinColumn(name = "id_sala")
    @JsonBackReference// Nombre de la columna en la tabla Tarifa que referencia a Salas
    private Salas sala; // Asegúrate de que coincide con el mappedBy en Salas

    // Otras propiedades y métodos
}
