package org.example;

public class Partido {

    public  enum Resultado {
        GANADO, PERDIDO, EMPATADO
    }
    private String equipoLocal;
    private String equipoVisitante;
    private Resultado resultado;

    public Partido(String equipoLocal, String equipoVisitante, Resultado resultado){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.resultado = resultado;
    }

    public String getEquipoLocal(){
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

}
