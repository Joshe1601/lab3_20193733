package com.example.lab3_20193733.controlador;

import com.example.lab3_20193733.entidad.Jugador;
import com.example.lab3_20193733.repositorio.JugadorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {


    @GetMapping(value = "/")
    public String principal() {
        return "lab2";
    }

}
