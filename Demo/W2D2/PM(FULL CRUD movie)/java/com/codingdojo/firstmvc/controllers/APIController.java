package com.codingdojo.firstmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.firstmvc.models.Movie;
import com.codingdojo.firstmvc.services.MovieService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/findAll")
	public List<Movie> findAllMovies(){
//		System.out.println("In Controller: findAllMovies");
		return movieService.allMovies();
	}

	@PostMapping("/movies")
	public Movie processCreateMovie(
			@RequestParam("name")String name,
			@RequestParam("duration") Integer duration,
			@RequestParam("genre") String genre
			) {
		Movie newMovie = new Movie(name, duration, genre);
		return movieService.addMovie(newMovie);
	}
	
	@GetMapping("/movies/{id}")
	public Movie findOneMovie(@PathVariable("id")Long id) {
		return movieService.findOne(id);
	}
	
	@PutMapping("/movies/{id}/edit")
	public Movie processUpdateMovie(@PathVariable("id")Long id,
			@RequestParam("name") String name,
			@RequestParam("duration") Integer duration,
			@RequestParam("genre") String genre
			) {
		return movieService.editMovie(id, name, duration, genre);
	}
	
	@DeleteMapping("/movies/{id}")
	public void processDeleteMovie(@PathVariable("id")Long id) {
		movieService.deleteMovie(id);
	}
				
	
}
