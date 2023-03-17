package org.example;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) throws IOException {
        String RUTA = "C:\\Users\\pc-nueva-ag\\Documents\\Andrea\\programacion\\JAVA\\Pronosticos Deportivos\\PronosticosDeportivos\\src\\main\\resources\\pronosticos.cvs";
        for (String renglon : Files.readAllLines(Paths.get("C:\\Users\\pc-nueva-ag\\Documents\\Andrea\\programacion\\JAVA\\Pronosticos Deportivos\\PronosticosDeportivos\\src\\main\\resources\\pronosticos.cvs")))
            System.out.println(renglon);
    }

}