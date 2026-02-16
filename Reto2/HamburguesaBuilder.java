package Reto2;

import java.util.ArrayList;
import java.util.List;


public class HamburguesaBuilder {
    private List<Ingrediente> ingredientes = new ArrayList<>();

    public HamburguesaBuilder agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(ingredientes);
    }
}
