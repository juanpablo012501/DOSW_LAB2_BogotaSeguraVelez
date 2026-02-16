package Reto2;

import java.util.Scanner;

public class Reto2 {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        HamburguesaBuilder builder = new HamburguesaBuilder();

        int opcion;

        System.out.println("Seleccione ingredientes para su hamburguesa:");

        do {
            System.out.println("""
                1. Pan ($3.000)
                2. Carne ($10.000)
                3. Queso ($5.000)
                4. Vegetales ($2.000)
                5. Salsas ($1.000)
                0. Finalizar pedido
                """);

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> builder.agregarIngrediente(
                        new Ingrediente("Pan", 3000));
                case 2 -> builder.agregarIngrediente(
                        new Ingrediente("Carne", 10000));
                case 3 -> builder.agregarIngrediente(
                        new Ingrediente("Queso", 5000));
                case 4 -> builder.agregarIngrediente(
                        new Ingrediente("Vegetales", 2000));
                case 5 -> builder.agregarIngrediente(
                        new Ingrediente("Salsas", 1000));
                case 0 -> System.out.println("Preparando su hamburguesa...");

                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        Hamburguesa hamburguesa = builder.build();

        System.out.println("\n--- HAMBURGUESA PERSONALIZADA ---");
        System.out.print("Ingredientes seleccionados: ");

        hamburguesa.getIngredientes()
                .forEach(i -> System.out.print(i.getNombre() + ", "));

        System.out.println("\nPrecio total: $" +
                hamburguesa.getPrecioTotal());

        System.out.println("¡Disfrute su hamburguesa!");
    }
}
