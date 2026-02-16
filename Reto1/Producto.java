package Reto1;

/**
 * Representa un producto disponible en la tienda de Don Pepe, 
 * con su nombre y precio unitario.
 */
public class Producto {
    private final String nombre;
    private final long precioUnitario;

    /**
     * Constructor para crear un producto con su nombre y precio unitario.
     * @param nombre El nombre del producto.
     * @param precioUnitario El precio unitario del producto en centavos.
     */
    public Producto(String nombre, long precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    /**
     * Constructor por defecto para crear un producto sin información.
     */
    public Producto() {
        this.nombre = null;
        this.precioUnitario = 0;
    }

    /**
     * Obtiene el nombre del producto.
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio unitario del producto en centavos.
     * @return El precio unitario del producto.
     */
    public long getPrecioUnitario() {
        return precioUnitario;
    }
}
