package br.com.dabliodc.design_pattern;

import br.com.dabliodc.design_pattern.builder.Endereco;
import br.com.dabliodc.design_pattern.factory.PizzaFactory;
import br.com.dabliodc.design_pattern.singleton.ConfigurationApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);

		// Strategy - evitar muitos if's, quebrando o código em métodos

		// Builder - Melhor de todos kkk, melhora a construção de objetos, deixando mais limpo e legivel
		var endereco = Endereco.builder()
				.rua("Avenida Dev")
				.complemento("Sou o melhor Dev da minha rua");
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
