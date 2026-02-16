package Reto1;

/**
 * Representa un artículo en el carrito de compras de Don Pepe. 
 * Contiene un producto y la cantidad de ese producto que se desea comprar.
 */
public class CartItem {
    private final Producto producto;
    private final int cantidad;

    public CartItem(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el producto asociado a este artículo del carrito.
     * @return El producto del artículo del carrito.
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * Obtiene la cantidad de unidades del producto en este artículo del carrito.
     * @return La cantidad de unidades del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Calcula el total de la línea para este artículo del carrito, 
     * multiplicando el precio unitario del producto por la cantidad.
     * @return El total de la línea para este artículo del carrito.
     */
    public long totalLinea() {
        return producto.getPrecioUnitario() * (long) cantidad;
    }
}
