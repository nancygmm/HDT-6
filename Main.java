import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Factory Mapa = new Factory();
        Scanner in = new Scanner(System.in);
        System.out.println("Bienvenido, a continuación se muestran las opciones disponibles para la creación de MAPAS");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        System.out.println("4. Salir");
        String x = in.next();
        Interfaz inter = Mapa.NuevoMapa(x);

    }
}
