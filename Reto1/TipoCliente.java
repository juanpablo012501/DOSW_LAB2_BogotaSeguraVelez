package Reto1;

/**
 * Enum que representa los tipos de clientes en la tienda de Don Pepe, 
 * cada uno con una tasa de descuento diferente.
 */
public enum TipoCliente {
    NUEVO(0.05),
    FRECUENTE(0.10);

    private final double tasa;

    TipoCliente(double tasa) {
        this.tasa = tasa;
    }

    /**
     * Calcula el descuento aplicable al subtotal de la compra según el tipo de cliente.
     * @param subtotal El subtotal de la compra en centavos.
     * @return El monto del descuento en centavos, redondeado al entero más cercano.
     */
    public long calcularDescuento(long subtotal) {
        return Math.round(subtotal * tasa);
    }
}
