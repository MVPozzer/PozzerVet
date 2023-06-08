package br.com.pozzervet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pozzervet.model.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

	
	
}
