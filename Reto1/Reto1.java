package Reto1;

import java.util.Scanner;

/**
 * Clase principal para ejecutar el reto 1, que simula una tienda de Don Pepe.
 * Permite a los usuarios ingresar su tipo de cliente, seleccionar productos y cantidades,
 * y luego muestra un recibo con el subtotal, descuento aplicado y total a pagar.
 */
public class Reto1 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        ProductFactory factory = new DonPepeProductFactory();
        ShoppingCart cart = new ShoppingCart();

        System.out.println("Bienvenido a la tienda Don Pepe! ");

        TipoCliente tipo = leerTipoCliente(scanner);
        String nombreCliente = (tipo == TipoCliente.FRECUENTE) ? "Frecuente" : "Nuevo";
        Cliente cliente = new Cliente(nombreCliente, tipo);

        System.out.println("Cliente: " + cliente.getNombre() + " ");
        System.out.println("Productos disponibles: ");
        System.out.println(" - Camiseta - $20.000 ");
        System.out.println(" - Pantalón - $50.000 ");
        System.out.println(" - Galletas - $500 ");
        System.out.println(" - Jugo Natural - $3.000 ");
        System.out.println("Ingrese su compra: ");

        while (true) {
            String line = scanner.nextLine().trim();
            if (line.isBlank()) break;

            String[] parsed = parseLine(line);
            if (parsed == null) continue;

            String productName = parsed[0];
            int qty = Integer.parseInt(parsed[1]);

            Producto p = factory.create(productName);
            if (p == null) continue;

            cart.add(p, qty);

            System.out.println(p.getNombre() + " " + qty + " unidades agregado al carrito. ");
        }

        long subtotal = cart.subtotal();
        long descuento = cliente.getTipo().calcularDescuento(subtotal);
        long total = subtotal - descuento;

        System.out.println("--- RECIBO DE COMPRA --- ");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos: ");

        for (CartItem item : cart.getItems()) {
            System.out.println("- " + item.getProducto().getNombre() + " - " + money(item.totalLinea()) + " ");
        }

        System.out.println("Subtotal: " + money(subtotal) + " ");
        System.out.println("Descuento aplicado: " + money(descuento) + " ");
        System.out.println("Total a pagar: " + money(total) + " ");
        System.out.println("------------------------ ");
        System.out.println("¡Gracias por su compra! ");
    }

    /**
     * Lee el tipo de cliente desde la entrada estándar, 
     * solicitando al usuario que ingrese "Frecuente" o "Nuevo".
     * @param scanner El objeto Scanner para leer la entrada del usuario.
     * @return El TipoCliente correspondiente al input del usuario.
     */
    private static TipoCliente leerTipoCliente(Scanner scanner) {
        while (true) {
            System.out.print("Ingrese tipo de cliente (Frecuente/Nuevo): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("frecuente")) return TipoCliente.FRECUENTE;
            if (input.equals("nuevo")) return TipoCliente.NUEVO;

        }
    }

    /**
     * Extrae el nombre del producto y la cantidad.
     * @param line La línea de entrada en formato "Producto: Cantidad".
     * @return Un arreglo de String con el nombre del producto y la cantidad, 
     * o null si el formato es incorrecto.
     */
    private static String[] parseLine(String line) {
        try {
            String[] parts = line.split(":");
            if (parts.length != 2) return null;

            String name = parts[0].trim();
            String right = parts[1].trim();

            String number = right.split("\\s+")[0];
            Integer.parseInt(number);

            return new String[]{name, number};
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Formatea un valor monetario en centavos a una cadena con formato de moneda.
     * @param value El valor en centavos a formatear.
     * @return Una cadena representando el valor formateado como moneda.
     */
    private static String money(long value) {
        return "$" + String.format("%,d", value).replace(',', '.');
    }
}
