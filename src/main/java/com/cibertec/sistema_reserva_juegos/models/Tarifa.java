package com.cibertec.sistema_reserva_juegos.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Tarifas")
@Table(name = "tarifa")

public class Tarifa {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarifa;

    @Column(name = "TipoEntrada")
    private String tipoEntrada;

    @Column(name = "Duracion")
    private double duracion;

    @Column(name = "Precio")
    private double precio;

    @Column(name = "DiaSemana")
    private String diaSemana;

}
