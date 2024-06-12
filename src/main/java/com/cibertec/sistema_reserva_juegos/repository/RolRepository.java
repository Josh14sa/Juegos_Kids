package com.cibertec.sistema_reserva_juegos.repository;

import com.cibertec.sistema_reserva_juegos.models.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer> {
}
