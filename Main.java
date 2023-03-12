import java.util.BufferedReader;
import java.util.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("cards_desc.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] cardData = line.split("\\|");
                String cardName = cardData[0].trim();
                String cardType = cardData[1].trim();
                cardMap.getAllCards().put(cardName, cardType);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }
        Scanner sn = new Scanner(System.in);
        int opcion; 
        System.out.println("Bienvenido, a continuación se muestran las opciones disponibles para la creación de MAPAS");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");
        System.out.println("4. Salir");

    }
}
