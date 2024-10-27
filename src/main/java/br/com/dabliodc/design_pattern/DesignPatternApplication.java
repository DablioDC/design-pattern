package br.com.dabliodc.design_pattern;

import br.com.dabliodc.design_pattern.builder.EnderecoBuilder;
import br.com.dabliodc.design_pattern.factory.PizzaFactory;
import br.com.dabliodc.design_pattern.singleton.ConfigurationApi;
import br.com.dabliodc.design_pattern.strategy.Pessoa;
import br.com.dabliodc.design_pattern.strategy.ValidaPessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		// Strategy - evitar muitos if's, quebrando o código em métodos
	 	// Geralmente é utilizado para implementar validações, facilita a definição do comportamento separando o código
		var pessoa = new Pessoa("12345678912");
		// Chamo o mesmo metodo, mas informo comportamentos distintos
		ValidaPessoa.validaPessoa(pessoa, new ValidaPessoa.ValidaPessoaFisica());
		ValidaPessoa.validaPessoa(pessoa, new ValidaPessoa.ValidaPessoaJuridica());

		// Builder - Melhor de todos kkk, melhora a construção de objetos, deixando mais limpo e legivel
        // Exemplo do builder direto na classe
//		var endereco = Endereco.builder()
//				.setRua("Avenida Dev")
//				.setComplemento("Sou o melhor Dev da minha rua");
//		var endereco2 = Endereco.builder()
//				.setRua("Avenida Teste2")
//				.setComplemento("Sou o melhor Dev da minha Casa");
//		System.out.println(endereco);
//		System.out.println(endereco2);
		// Exemplo com o Builder separado, numa outra classe: EnderecoBuilder
		var endereco = EnderecoBuilder.builder()
				.rua("Avenida Ivai")
				.complemento("Casa da mae joana")
				.build();
		System.out.println(endereco);

		// Exemplo Factory - Evitar muitos News na aplicação
		var pizzaDoce = PizzaFactory.getPizzaInstance(true);
		var pizzaSalgada = PizzaFactory.getPizzaInstance(false);
		System.out.println(pizzaDoce);
		System.out.println(pizzaSalgada);

		// Exemplo Singleton - classe única no sistema, instanciada apenas uma vez
		var configuration = ConfigurationApi.getInstance();
		var configuration2 = ConfigurationApi.getInstance();
		System.out.println(configuration);
		System.out.println(configuration2);
	}
}
