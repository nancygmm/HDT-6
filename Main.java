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
        HashMap<String, String> MapaP = new HashMap<String, String>();

        try (BufferedReader br = new BufferedReader(new FileReader(
                "/Users/nancymazariegos/Documents/Tareas Tercer Semestre/Algoritmos y Estructuras de Datos/HDT-6/HDT-6/cards_desc.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {

                String[] cadena = line.split("\\|");
                MapaP.put(cadena[0].trim(), cadena[1].trim());
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        String a = "";
        while (!"No".equals(a)){
        System.out.println("A continuación se presentan las siguientes opciones:");
        System.out.println("1. Agregar una carta");
        System.out.println("2. Mostrar el tipo de una carta");
        System.out.println("3. Mostar nombre y tipo");
        System.out.println("4. Nostar nombre y tipo (ordenadas)");
        System.out.println("5. Mosrar nombre y tipo existentes");
        System.out.println("6. Mostrar nombre y tipo existentes (ordenadas)");
        int z = in.nextInt();
        Scanner sc = new Scanner(System.in);
        if (z==1){
            System.out.println("Ingrese el nombre de la carta que desea ingresar");
            String carta = sc.next();
            String valor = MapaP.get(carta);
            MapaP.remove(valor);
            inter.AgregarMap(carta, valor);
        } else if (z==2){
            System.out.println("Ingrese el nombre de la carta de la que quiere saber el tipo");
            String obj = in.next();
            inter.MostrarTipoMap(obj);
        } else if (z==3){

        } else if (z==4){

        } else if (z==5){

        } else if (z==6){

        } else {
            System.out.println("Ups, esta opción no existe");
            a = sc.next();
        }
        System.out.println("¿Desea continuar?");
            a = sc.next();
        }
    }
}
