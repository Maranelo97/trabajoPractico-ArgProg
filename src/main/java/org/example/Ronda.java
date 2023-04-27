package org.example;
import java.util.ArrayList;
import java.util.List;

public class Ronda {

    private List<Partido> partidos;
    private List<Persona> participantes;

    public Ronda(List<Partido> partidos, List<Persona> participantes) {
        this.partidos = partidos;
        this.participantes = participantes;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public List<Persona> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Persona> participantes) {
        this.participantes = participantes;
    }

    public void agregarPartido(Partido partido) {
        partidos.add(partido);
    }

    public void agregarParticipante(Persona participante) {
        participantes.add(participante);
    }

}
