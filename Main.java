/*
Profesor: Douglas Leonel Barrios
Auxiliares: Fernanda Esquivel y Francisco Castillo
INTEGRANTES: 
Nancy Gabriela Mazariegos Molina, 22513
12/03/2023
Hoja de Trabajo 6
Curso: Algoritmos y Estructuras de datos
Sección: 20
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.HashMap;
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

        try (BufferedReader lector = new BufferedReader(new FileReader(
                "/Users/nancymazariegos/Documents/Tareas Tercer Semestre/Algoritmos y Estructuras de Datos/HDT-6/HDT-6/cards_desc.txt"))) {
            String line;

            while ((line = lector.readLine()) != null) {

                String[] cadena = line.split("\\|");
                MapaP.put(cadena[0].trim(), cadena[1].trim());
            }

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        String a = "";
        while (!"No".equals(a)){
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación se presentan las siguientes opciones:");
        System.out.println("1. Agregar una carta");
        System.out.println("2. Mostrar el tipo de una carta");
        System.out.println("3. Mostar nombre y tipo");
        System.out.println("4. mostar nombre y tipo (ordenadas)");
        System.out.println("5. Mosrar nombre y tipo existentes");
        System.out.println("6. Mostrar nombre y tipo existentes (ordenadas)");
        int z = in.nextInt();
        switch (z){
            case 1:
                Scanner s1 = new Scanner(System.in);
                System.out.println("Ingrese el nombre de la carta que desea ingresar");
                String carta = s1.nextLine();
                String valor = MapaP.get(carta);
                
                inter.AgregarMap(carta, valor);
                System.out.println(carta + valor);
                break;
            case 2:
                Scanner s2 = new Scanner(System.in);
                System.out.println("Ingrese el nombre de la carta de la que quiere saber el tipo");
                String obj = s2.nextLine();
                System.out.println(obj + " " + MapaP.get(obj));
                inter.MostrarTipoMap(obj);
                break;
            case 3:
                inter.MostrarTodoUsuarioMap();
                break;
            case 4:
                inter.MostrarTodoUsuarioOrdenadoMap();
                break;
            case 5:
                System.out.println(MapaP);
                break;
    
            case 6:
                List<Map.Entry<String, String>> l = new ArrayList<>(MapaP.entrySet());
    
                        Comparator<Map.Entry<String, String>> c = new Comparator<Map.Entry<String, String>>() {
                            @Override
                            public int compare(Map.Entry<String, String> e1, Map.Entry<String, String> e2) {
                                return e1.getValue().compareTo(e2.getValue());
                            }
                        };
    
                        Collections.sort(l, c);
    
                        for (Map.Entry<String, String> en : l) {
                            System.out.println(en.getKey() + " = " + en.getValue());
            }
            System.out.println("¿Desea continuar?");
            a = sc.next();
        }
        
        
        }
    }
}
