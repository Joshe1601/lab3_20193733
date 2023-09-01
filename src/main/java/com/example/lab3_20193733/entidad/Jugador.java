package com.example.lab3_20193733.entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "Jugador")
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idJugador", nullable = false)
    private int idJugador;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "posicion", nullable = false)
    private String posicion;

    @Column(name = "club", nullable = false)
    private String club;

    @Column(name = "sn_idSeleccion", nullable = false)
    private int sn_idSeleccion;

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getSn_idSeleccion() {
        return sn_idSeleccion;
    }

    public void setSn_idSeleccion(int sn_idSeleccion) {
        this.sn_idSeleccion = sn_idSeleccion;
    }
}
