package Reto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Representa un carrito de compras en la tienda de Don Pepe. 
 * Permite agregar productos con sus cantidades y calcular el subtotal de la compra.
 */
public class ShoppingCart {

    private final List<CartItem> items = new ArrayList<>();

    /**
     * Agrega un producto al carrito con la cantidad especificada.
     * @param producto El producto a agregar al carrito.
     * @param cantidad La cantidad del producto a agregar.
     */
    public void add(Producto producto, int cantidad) {
        if (producto == null || cantidad <= 0) return;
        items.add(new CartItem(producto, cantidad));
    }

    /**
     * Obtiene una lista de los items en el carrito. 
     * La lista es inmodificable para proteger la integridad del carrito.
     * @return Una lista de CartItem representando los productos y cantidades en el carrito.
     */
    public List<CartItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    /**
     * Calcula el subtotal de la compra sumando el total de cada línea (producto x cantidad).
     * @return El subtotal de la compra en centavos.
     */
    public long subtotal() {
        return items.stream().mapToLong(CartItem::totalLinea).sum();
    }
}
