package com.codingdojo.firstmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.firstmvc.models.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long>{
	List<Movie> findAll();
}
