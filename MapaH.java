import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapaH implements Interfaz{
    Scanner in = new Scanner(System.in);
    HashMap H = new HashMap();
    @Override
    public void AgregarMap(){
        H.put(in, H);
    }
    @Override
    public void MostrarTipoMap(){
        System.out.println("Ingrese la carta de la quiere saber el tipo");
        String carta = in.next();
        for(int i=0; i<H.size();i++){
            if(H.containsKey(carta)){
                System.out.println(H.get(carta));
            }    
        }
    }
    @Override
    public void MostrarTodoUsuarioMap(){
        System.out.println(H);
    }
    @Override
    public void MostrarTodoUsuarioOrdenadoMap(){ 
        List<Map.Entry<Integer, String>> list =
                new ArrayList<>(H.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            public int compare(Map.Entry<Integer, String> o1,
                               Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Original HashMap: " + H);
        System.out.println("Sorted HashMap by value: " + sortedMap);
    }
    @Override
    public void MostrarExistentesMap(){

    }
    @Override
    public void MostrarExistentesOrdenadoMap(){
        
    }
}

