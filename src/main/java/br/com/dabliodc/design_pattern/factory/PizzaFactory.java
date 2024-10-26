package br.com.dabliodc.design_pattern.factory;

public class PizzaFactory {

    private PizzaFactory (){
    }

    public static Pizza getPizzaInstance(boolean sabor){
        return sabor ? new RomeuJulietaPizza() : new StrogonoffCarnePizza();
    }
}
