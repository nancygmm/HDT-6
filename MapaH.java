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

