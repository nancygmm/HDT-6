import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapaH implements Interfaz{
    Scanner in = new Scanner(System.in);
    HashMap H = new HashMap();
    public void AgregarMap(){
        H.put(in, H);
    }
    public void MostrarTipoMap(){
        System.out.println("Ingrese la carta de la quiere saber el tipo");
        String carta = in.next();
        for(int i = 0; i<H.size();i++){
            if (carta.equals(H.size(i))){
                System.out.println();
            }
        }
    }
    public void MostrarTodoUsuarioMap(){

    }
    public void MostrarTodoUsuarioOrdenadoMap(){

    }
    public void MostrarExistentesMap(){

    }
    public void MostrarExistentesOrdenadoMap(){
        
    }
}

