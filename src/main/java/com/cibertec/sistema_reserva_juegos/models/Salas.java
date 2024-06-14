package com.cibertec.sistema_reserva_juegos.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
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

    @OneToMany(mappedBy = "sala", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Reservas> reservas;

    // Relación con Tarifa
    @OneToOne(mappedBy = "sala", cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tarifa") // Esta anotación se usa para personalizar la columna de unión
    private Tarifa tarifa; // Asegúrate de que coincide con el mappedBy en Tarifa

}
