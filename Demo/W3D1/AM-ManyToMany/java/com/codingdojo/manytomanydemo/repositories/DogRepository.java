package com.codingdojo.manytomanydemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.manytomanydemo.models.Dog;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long>{
	List<Dog> findAll();
}
