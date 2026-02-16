package Reto2;
import java.util.List;

public class Hamburguesa {
    private List<Ingrediente> ingredientes;

    public Hamburguesa(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public int getPrecioTotal() {
        return ingredientes.stream()
                .mapToInt(Ingrediente::getPrecio)
                .sum();
    }
}
