package Reto1;

/**
 * Representa un cliente de la tienda de Don Pepe.
 */
public class Cliente {
    private final String nombre;
    private final TipoCliente tipo;

    /**
     * Constructor para crear un cliente con su nombre y tipo.
     * @param nombre
     * @param tipo
     */
    public Cliente(String nombre, TipoCliente tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el tipo de cliente, que determina el descuento aplicable.
     * @return El tipo de cliente.
     */
    public TipoCliente getTipo() {
        return tipo;
    }
}
