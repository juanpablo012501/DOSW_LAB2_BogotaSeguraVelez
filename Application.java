import Reto1.*;
import Reto2.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el reto que desea ejecutar:");
        System.out.println("1. Reto 1 - Tienda de Don Pepe");
        System.out.println("2. Reto 2 - Chef de 5 Estrellas");
        
        int opcion = scanner.nextInt();
        
        switch(opcion) {
            case 1 -> Reto1.ejecutar();
            case 2 -> Reto2.ejecutar();
            default -> System.out.println("Opción no válida.");
        }
        
        scanner.close();
    }
}

