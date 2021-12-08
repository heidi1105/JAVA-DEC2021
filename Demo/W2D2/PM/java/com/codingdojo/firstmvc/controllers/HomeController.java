package com.codingdojo.firstmvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.firstmvc.models.Movie;
import com.codingdojo.firstmvc.services.MovieService;

@Controller
public class HomeController {
	
	private final MovieService movieService;
	
	public HomeController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping("/dashboard")
	public String dashboard(Model model) {
		List<Movie> movies = movieService.allMovies();
		model.addAttribute("movies", movies);
		return "dashboard.jsp";
	}
	
	@GetMapping("/movies/create")
	public String showCreateForm(@ModelAttribute("newMovie") Movie newMovie) {
		return "createForm.jsp";
	}
	
	@PostMapping("/movies/create")
	public String processCreateMovie(@Valid @ModelAttribute("newMovie")Movie newMovie,
			BindingResult result) {
		if(result.hasErrors()) {
			return "createForm.jsp";
		}else {
			movieService.addMovie(newMovie);
			return "redirect:/dashboard";			
		}
	}
	
	@GetMapping("/movies/{id}")
	public String showOneMovie(@PathVariable("id")Long id, Model model) {
		Movie movie = movieService.findOne(id);
		model.addAttribute("movie", movie);
		return "showOneMovie.jsp";
	}
	
	@GetMapping("/movies/{id}/edit")
	public String editOneMovie(@PathVariable("id")Long id, Model model) {
		Movie movie = movieService.findOne(id);
		model.addAttribute("movie", movie);
		return "updateForm.jsp";
	}
		
	
	@PutMapping("/movies/{id}/edit")
	public String processEditMovie( @Valid @ModelAttribute("movie")Movie movie,
			BindingResult result,@PathVariable("id")Long id) {
		System.out.println("in controller");
		if(result.hasErrors()) {
			return "updateForm.jsp";
		}else {
			movieService.editModelMovie(movie);
			return "redirect:/dashboard";			
		}
	}	
	
	@DeleteMapping("/movies/{id}")
	public String processDeleteMovie(@PathVariable("id")Long id) {
		movieService.deleteMovie(id);
		return "redirect:/dashboard";
	}
}







