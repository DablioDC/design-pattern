package br.com.dabliodc.design_pattern.factory;

public class Ingrediente {

    private String nome;

    private Ingrediente(){
    }

    protected Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
