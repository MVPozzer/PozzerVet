package br.com.pozzervet.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.pozzervet.model.Animal;
import br.com.pozzervet.model.Atendimento;
import br.com.pozzervet.model.Responsavel;
import br.com.pozzervet.model.Vacina;

@Configuration
public class Configuracoes {

	
	@Bean
	public Animal animal() {
		
		return new Animal();
	}
	
	@Bean
	public Responsavel responsavel() {
		
		return new Responsavel();
	}
	
	@Bean
	public Vacina vacina() {
		
		return new Vacina();
	}
	
	@Bean
	public Atendimento atendimento() {
		
		return new Atendimento();
	}
}
