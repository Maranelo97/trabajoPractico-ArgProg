package org.example;
import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private List<Pronostico> pronosticos;
    private int puntajeAcumulado;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.pronosticos = new ArrayList<>();
        this.puntajeAcumulado = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPronostico(Pronostico pronostico) {
        pronosticos.add(pronostico);
    }

    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }

    public int getPuntajeAcumulado() {
        return puntajeAcumulado;
    }

    public void sumarPuntaje(int puntaje) {
        puntajeAcumulado += puntaje;
    }

}
