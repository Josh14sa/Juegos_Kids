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
@Table(name = "Sala")
public class Salas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sala")
    private int idSala;

    @Column(name = "nombre_sala")
    private String nombreSala;

    @Column(name = "aforo")
    private int aforo;

    @Column(name = "rango_edad")
    private String rangoEdad;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_tarifa", referencedColumnName = "id_tarifa")
    private Tarifa tarifa;

    @OneToMany(mappedBy = "sala")
    private List<Reservas> reservas;
}
