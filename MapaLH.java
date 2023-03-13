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
import java.util.LinkedHashMap;
import java.util.*;

public class MapaLH implements Interfaz{
    Scanner in = new Scanner(System.in);
    LinkedHashMap <String, String> LH = new LinkedHashMap<String, String>();
    
    @Override
    public void AgregarMap(String carta, String tipo){
        LH.put(carta, tipo);
    }
    @Override
    public void MostrarTipoMap(String obj){
     if (LH.containsKey(obj)){
        String k = LH.get(obj);
        System.out.println(k);
     }
    }
    @Override
    public void MostrarTodoUsuarioMap(){
        System.out.println(LH);
    }
    @Override
    public void MostrarTodoUsuarioOrdenadoMap(){ 
        List<Map.Entry<String, String>> valores = new ArrayList<>(LH.entrySet());
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

