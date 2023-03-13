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
import java.util.*;
import java.util.Map.Entry;

public class MapaH implements Interfaz{
    Scanner in = new Scanner(System.in);
    HashMap <String, String> H = new HashMap<String, String>();
    
    @Override
    public void AgregarMap(String carta, String tipo){
        H.put(carta, tipo);
    }
    @Override
    public void MostrarTipoMap(String obj){
     if (H.containsKey(obj)){
        String k = H.get(obj);
        System.out.println(k);
     }
    }
    @Override
    public void MostrarTodoUsuarioMap(){
        System.out.println(H);
    }
    @Override
    public void MostrarTodoUsuarioOrdenadoMap(){ 
        List<Map.Entry<String, String>> valores = new ArrayList<>(H.entrySet());
        Comparator<Map.Entry<String, String>> comparador = new Comparator<Map.Entry<String,String>>() {
            @Override
            public int compare(Map.Entry<String, String> e1, Map.Entry<String, String> e2) {
              return e1.getValue().compareTo(e2.getValue());
            }
        };
        Collections.sort(valores, comparador);
        for (Map.Entry<String, String> entry : valores){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
    @Override
    public void MostrarExistentesMap(){

    }
    @Override
    public void MostrarExistentesOrdenadoMap(){
        
    }
}

