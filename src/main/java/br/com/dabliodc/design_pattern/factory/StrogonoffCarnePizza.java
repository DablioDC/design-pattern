package br.com.dabliodc.design_pattern.factory;

import java.util.List;

public class StrogonoffCarnePizza extends Pizza {

    protected StrogonoffCarnePizza() {
        this.ingredientes = List.of(
                new Ingrediente("Massa"),
                new Ingrediente("Molho"),
                new Ingrediente("Carne"),
                new Ingrediente("Batata Palha")
        );
    }
}
