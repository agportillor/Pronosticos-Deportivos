package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String archPronosticos = "src/main/resources/pronosticos.csv";
        String archResultados = "src/main/resources/resultados.csv";

        String[] lineas = Files.readAllLines(Paths.get(archPronosticos)).toArray(new String[0]);

        for (String linea : lineas) {
            String[] valores = linea.split(";");

            for (String valor : valores) {
                System.out.print(valor + " ");
            }

            System.out.println();
        }
    };
}