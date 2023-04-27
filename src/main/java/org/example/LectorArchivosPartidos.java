package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivosPartidos {
    public List<Partido> leerArchivo(String nombreArchivo) {

        List<Partido> partidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String equipoLocal = datos[0];
                String equipoVisitante = datos[1];
                Partido.Resultado resultado = Partido.Resultado.valueOf(datos[2].toUpperCase());
                Partido partido = new Partido(equipoLocal, equipoVisitante, resultado);
                partidos.add(partido);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return partidos;
    }
}
