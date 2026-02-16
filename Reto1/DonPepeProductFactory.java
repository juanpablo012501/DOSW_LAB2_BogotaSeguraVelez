package Reto1;

/**
 * Fábrica de productos para la tienda de Don Pepe. 
 * Implementa el patrón Factory Method para crear instancias 
 * de Producto basadas en el nombre del producto solicitado.
 */
public class DonPepeProductFactory implements ProductFactory {

    @Override
    public Producto create(String productName) {
        if (productName == null) return null;

        String key = productName.trim().toLowerCase();

        if (key.equals("camiseta")) {
            return new Producto("Camiseta", 20000);
        }

        if (key.equals("pantalón") || key.equals("pantalon")) {
            return new Producto("Pantalón", 50000);
        }

        if (key.equals("galletas")) {
            return new Producto("Galletas", 500);
        }

        if (key.equals("jugo natural")) {
            return new Producto("Jugo Natural", 3000);
        }

        return null;
    }
}
