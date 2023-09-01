package com.example.lab3_20193733.repositorio;

import com.example.lab3_20193733.entidad.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<Jugador, Integer> {

}
