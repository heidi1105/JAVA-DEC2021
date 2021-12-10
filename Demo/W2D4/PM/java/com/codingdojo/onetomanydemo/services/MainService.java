package com.codingdojo.onetomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.onetomanydemo.models.Breed;
import com.codingdojo.onetomanydemo.models.Dog;
import com.codingdojo.onetomanydemo.repositories.BreedRepository;
import com.codingdojo.onetomanydemo.repositories.DogRepository;

@Service
public class MainService {

	// OPTION 1
//	private DogRepository dogRepo;
//	private BreedRepository breedRepo;
//	
//	public MainService(DogRepository dogRepo,BreedRepository breedRepo ) {
//		this.dogRepo = dogRepo;
//		this.breedRepo = breedRepo;
//	}
//	
	//OPTION 2
	@Autowired
	DogRepository dogRepo;
	
	@Autowired
	BreedRepository breedRepo;
	
	public List<Dog> allDogs(){
		return dogRepo.findAll();
	}
	
	public List<Breed> allBreeds(){
		return breedRepo.findAll();
	}
	
	public Dog saveDog(Dog dog) {
		return dogRepo.save(dog);
	}
	
	public Breed saveBreed(Breed breed) {
		return breedRepo.save(breed);
	}
	
	public Breed findOneBreed(Long id) {
		Optional<Breed> optionalBreed = breedRepo.findById(id);
		if(optionalBreed.isPresent()) {
			return optionalBreed.get();
		}else {
			return null;
		}
	}
	
	
}





















