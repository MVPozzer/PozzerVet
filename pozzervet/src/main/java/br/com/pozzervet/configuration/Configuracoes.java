package br.com.pozzervet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.pozzervet.model.Animal;

@Configuration
public class Configuracoes {

	
	@Bean
	public Animal animal() {
		
		return new Animal();
	}
	
	
}
