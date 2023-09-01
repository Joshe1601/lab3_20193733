package com.example.lab3_20193733.controlador;

import com.example.lab3_20193733.entidad.Jugador;
import com.example.lab3_20193733.repositorio.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class JugadorController {
    final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping(value = "/jugador")
    public String listarJugadores() {
        List<Jugador> jugadores = jugadorRepository.findAll();
        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre());
        }
        return "jugador";
    }
}
