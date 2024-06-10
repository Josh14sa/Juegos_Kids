package com.cibertec.sistema_reserva_juegos.repository;

import com.cibertec.sistema_reserva_juegos.models.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa, Integer> {
}
