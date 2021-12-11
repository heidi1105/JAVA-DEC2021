package com.codingdojo.onetomanydemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.onetomanydemo.models.Breed;

@Repository
public interface BreedRepository extends CrudRepository<Breed, Long>{

	List<Breed> findAll();
}
