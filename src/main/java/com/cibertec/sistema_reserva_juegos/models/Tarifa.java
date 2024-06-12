package com.cibertec.sistema_reserva_juegos.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
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

    @OneToMany(mappedBy = "tarifa")
    private List<Salas> salas;
}
