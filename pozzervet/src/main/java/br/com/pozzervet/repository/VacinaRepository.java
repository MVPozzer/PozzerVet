package br.com.pozzervet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pozzervet.model.Vacina;

@Repository
public interface VacinaRepository extends JpaRepository<Vacina, Long> {
	
}
