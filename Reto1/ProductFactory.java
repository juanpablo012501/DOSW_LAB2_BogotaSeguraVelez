package Reto1;

/**
 * Fábrica de productos para la tienda de Don Pepe. 
 * Implementa el patrón Factory Method para crear instancias 
 * de Producto basadas en el nombre del producto solicitado.
 */
public interface ProductFactory {
    Producto create(String productName);
}
