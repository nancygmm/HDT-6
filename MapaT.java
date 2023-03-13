import java.util.TreeMap;
import java.util.*;

public class MapaT implements Interfaz{
    Scanner in = new Scanner(System.in);
    TreeMap <String, String> T = new TreeMap <String, String>();
    @Override
    public void AgregarMap(String carta, String tipo){
        T.put(carta, tipo);
    }
    @Override
    public void MostrarTipoMap(String obj){
        System.out.println("Ingrese la carta de la quiere saber el tipo");
        String carta = in.next();
        for(int i=0; i<T.size();i++){
            if(T.containsKey(carta)){
                System.out.println(T.get(carta));
            }    
        }
    }
    @Override
    public void MostrarTodoUsuarioMap(){
        System.out.println(T);
    }
    @Override
    public void MostrarTodoUsuarioOrdenadoMap(){

    }
    @Override
    public void MostrarExistentesMap(){

    }
    @Override
    public void MostrarExistentesOrdenadoMap(){
        
    }
}
