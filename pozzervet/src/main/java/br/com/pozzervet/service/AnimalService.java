package br.com.pozzervet.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.pozzervet.model.Animal;

@Service
public class AnimalService {

	@Autowired
	private Animal animal;
	

}