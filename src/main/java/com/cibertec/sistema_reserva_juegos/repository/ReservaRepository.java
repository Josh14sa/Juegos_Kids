package com.cibertec.sistema_reserva_juegos.repository;

import com.cibertec.sistema_reserva_juegos.models.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ReservaRepository extends JpaRepository<Reservas, Integer> {
}
