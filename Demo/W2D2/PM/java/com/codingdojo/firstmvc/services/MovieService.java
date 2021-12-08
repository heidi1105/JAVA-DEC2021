package com.codingdojo.firstmvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.firstmvc.models.Movie;
import com.codingdojo.firstmvc.repositories.MovieRepository;

@Service
public class MovieService {

	private final MovieRepository movieRepo;
	
	public MovieService(MovieRepository movieRepo) {
		this.movieRepo= movieRepo;
	}

// findAll() v
// findOne()
// create() v
// update()
// delete()
	
	public List<Movie> allMovies(){
//		System.out.println("In Service: allMovies");
		return movieRepo.findAll();
	}
	
	public Movie addMovie(Movie movie) {
		// id & createdAT &updatedAt : NULL
		// MySQL will create them automatically
		return movieRepo.save(movie);
	}
	
	public Movie findOne(Long id) {
		Optional<Movie> optionalMovie = movieRepo.findById(id);
		if(optionalMovie.isPresent()) {
			return optionalMovie.get(); // optionalMovie.get() gives you movie
		}else {
			return null;
		}		
	}
	
	public Movie editMovie(Long id, String name, Integer duration, String genre) {
		Movie oldMovie = this.findOne(id);
		oldMovie.setName(name);
		oldMovie.setDuration(duration);
		oldMovie.setGenre(genre);
		return movieRepo.save(oldMovie);
	}
	
	public void deleteMovie(Long id) {
		movieRepo.deleteById(id);
	}
	
	
	public Movie editModelMovie(Movie movie) {
		return movieRepo.save(movie);
	}
}
