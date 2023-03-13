import java.util.HashMap;
import java.util.*;

public class MapaH implements Interfaz{
    Scanner in = new Scanner(System.in);
    HashMap <String, String> H = new HashMap<String, String>();
    
    @Override
    public void AgregarMap(String carta, String tipo){
        H.put(carta, tipo);
    }
    @Override
    public void MostrarTipoMap(String obj){
     
    }
    @Override
    public void MostrarTodoUsuarioMap(){
        System.out.println(H);
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

