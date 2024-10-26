package br.com.dabliodc.design_pattern.factory;

import java.util.List;

public class RomeuJulietaPizza extends Pizza {

    protected RomeuJulietaPizza() {
        this.ingredientes = List.of(
                new Ingrediente("Massa"),
                new Ingrediente("Chorolate"),
                new Ingrediente("Morango")
        );
    }
}
