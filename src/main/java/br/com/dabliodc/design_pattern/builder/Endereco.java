package br.com.dabliodc.design_pattern.builder;

public class Endereco {

    private String rua;
    private String complemento;

    // Quando utilizar o Builder separado no exemplo com EnderecoBuilder o construtor tem que ser Protected e não private
    // e as classes tem que segui o padrão de estar no mesmo Package, para que via protected ela possa ser acessada.
    protected Endereco(){
    }

    public static Endereco builder(){
        return new Endereco();
    }

    // Sets do formato do builder direto na classe
//    public Endereco setRua(String rua){
//        this.rua = rua;
//        return this;
//    }

//    public Endereco setComplemento(String complemento){
//        this.complemento = complemento;
//        return this;
//    }

    //Sets do modelo do builder separado
    protected void setRua(String rua){
        this.rua = rua;
    }

    protected void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public String getComplemento() {
        return complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
