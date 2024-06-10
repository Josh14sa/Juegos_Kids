package com.cibertec.sistema_reserva_juegos.repository;

import com.cibertec.sistema_reserva_juegos.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository  extends JpaRepository<Clientes, Integer> {
    @Query("select c from Cliente c where c.apellido like ?1")
    public List<Clientes> listApellidoCliente(String ape);

}
