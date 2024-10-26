package br.com.dabliodc.design_pattern.builder;

public class Endereco {

    private String rua;
    private String complemento;

    private Endereco(){
    }

    public static Endereco builder(){
        return new Endereco();
    }

    public Endereco rua(String rua){
        this.rua = rua;
        return this;
    }

    public Endereco complemento(String complemento){
        this.complemento = complemento;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
