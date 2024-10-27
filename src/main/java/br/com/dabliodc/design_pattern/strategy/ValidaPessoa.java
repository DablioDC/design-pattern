package br.com.dabliodc.design_pattern.strategy;

public class ValidaPessoa {

    public static void validaPessoa(Pessoa pessoa, IValidator validator){
        validator.validate(pessoa);
    }

    public static class ValidaPessoaFisica implements IValidator {
        @Override
        public void validate(Pessoa pessoa){
            if(pessoa.getRegistro().length() > 11) {
                throw new IllegalArgumentException("CPF tem mais de 11 caracteres");
            }
        }
    }

    public static class ValidaPessoaJuridica implements IValidator {
        @Override
        public void validate(Pessoa pessoa){
            if(pessoa.getRegistro().length() < 14) {
                throw new IllegalArgumentException("CNPJ tem menos de 14 caracteres");
            }
        }
    }
}
