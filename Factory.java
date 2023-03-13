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
