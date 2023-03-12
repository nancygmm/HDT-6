import java.util.TreeMap;
import java.util.Map;
import java.util.*;

public class MapaT implements Interfaz{
    Scanner in = new Scanner(System.in);
    TreeMap T = new TreeMap();
    @Override
    public void AgregarMap(){
        T.put(in, T);
    }
    @Override
    public void MostrarTipoMap(){
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
