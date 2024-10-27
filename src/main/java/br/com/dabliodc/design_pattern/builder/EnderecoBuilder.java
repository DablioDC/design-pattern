package br.com.dabliodc.design_pattern.builder;

import javax.xml.stream.events.EntityReference;

public class EnderecoBuilder {

    private Endereco endereco;

    private EnderecoBuilder(){
        endereco = new Endereco();
    }

    public static EnderecoBuilder builder(){
        return new EnderecoBuilder();
    }

    public EnderecoBuilder rua(String rua){
        this.endereco.setRua(rua);
        return this;
    }

    public EnderecoBuilder complemento(String complemento){
        this.endereco.setComplemento(complemento);
        return this;
    }

    public Endereco build(){
        return this.endereco;
    }
}
