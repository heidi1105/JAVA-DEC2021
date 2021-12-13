package com.codingdojo.manytomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.manytomanydemo.models.Dog;
import com.codingdojo.manytomanydemo.models.Treat;
import com.codingdojo.manytomanydemo.repositories.DogRepository;
import com.codingdojo.manytomanydemo.repositories.TreatRepository;

@Service
public class MainService {

	private DogRepository dogRepo;
	private TreatRepository treatRepo;
	
	public MainService(DogRepository dogRepo, TreatRepository treatRepo) {
		this.dogRepo= dogRepo;
		this.treatRepo = treatRepo;
	}
	
	//add a dog
	public Dog addDog(Dog dog) {
		return dogRepo.save(dog);
	}
	
	//add a treat
	public Treat addTreat(Treat treat) {
		return treatRepo.save(treat);
	}
	
	// all dogs
	public List<Dog> allDogs(){
		return dogRepo.findAll();
	}
	
	// all treats
	public List<Treat> allTreats(){
		return treatRepo.findAll();
	}
	
	// find one dog
	public Dog findOneDog(Long dogId) {
		Optional<Dog> optionalDog = dogRepo.findById(dogId);
		if(optionalDog.isPresent()) {
			return optionalDog.get();
		}else {
			return null;
		}
	}
	
	// find one treat
	public Treat findOneTreat(Long treatId) {
		Optional<Treat> optionalTreat = treatRepo.findById(treatId);
		if(optionalTreat.isPresent()) {
			return optionalTreat.get();
		}else {
			return null;
		}
	}
	
	
	public Dog addTreatToDog(Dog dog) {
		return dogRepo.save(dog);
	}
	
	
}
