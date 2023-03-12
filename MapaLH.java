import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;

public class MapaLH implements Interfaz{
    Scanner in = new Scanner(System.in);
    LinkedHashMap LH = new LinkedHashMap();
    @Override
    public void AgregarMap(String carta, String tip){
        LH.put(in, LH);
    }
    @Override
    public void MostrarTipoMap(String obj){
        System.out.println("Ingrese la carta de la quiere saber el tipo");
        String carta = in.next();
        for(int i=0; i<LH.size();i++){
            if(LH.containsKey(carta)){
                System.out.println(LH.get(carta));
            }    
        }
    }
    @Override
    public void MostrarTodoUsuarioMap(){
        System.out.println(LH);
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

