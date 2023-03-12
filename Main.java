import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        HashMap<String, String> MapaHP = new HashMap<String, String>();

        try (BufferedReader br = new BufferedReader(new FileReader(
                "/Users/nancymazariegos/Documents/Tareas Tercer Semestre/Algoritmos y Estructuras de Datos/HDT-6/HDT-6/cards_desc.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] cadena = line.split("\\|");
                MapaHP.put(cadena[0].trim(), cadena[1].trim());
                System.out.println(MapaHP);
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

    }
}
