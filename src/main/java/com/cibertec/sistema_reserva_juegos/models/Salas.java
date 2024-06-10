package com.cibertec.sistema_reserva_juegos.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Salas")
@Table(name = "salas")

public class Salas {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSala;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Aforo")
    private String aforo;

    @Column(name = "HoraAtencion")
    private Date horaAtencion;
}
