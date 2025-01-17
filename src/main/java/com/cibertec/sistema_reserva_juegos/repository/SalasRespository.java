package com.cibertec.sistema_reserva_juegos.repository;

import com.cibertec.sistema_reserva_juegos.models.Salas;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalasRespository extends JpaRepository<Salas, Integer> {
}
