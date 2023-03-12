public class Factory {

    public Interfaz NuevoMapa(String newMapa){
        if (newMapa.equalsIgnoreCase("HashMap")){
            return new MapaH();
        } else if (newMapa.equalsIgnoreCase("TreeMap")){
            return new MapaT();
        } else if (newMapa.equalsIgnoreCase("LinkedHashMap")){
            return new MapaLH();
        } else {
            return new MapaV();
        }
    }
}
