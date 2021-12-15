package com.codingdojo.beltreview.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.beltreview.models.Project;
import com.codingdojo.beltreview.models.User;
import com.codingdojo.beltreview.repositories.ProjectRepository;

@Service
public class MainService {
	
	@Autowired
	private ProjectRepository projectRepo;

	// find all projects
	public List<Project> allProjects(){
		return projectRepo.findAll();
	}
	
	// create a project
	public Project addProject(Project project) {
		return projectRepo.save(project);
	}
	
	// edit a project
	public Project editProject(Project project) {
		return projectRepo.save(project);
	}	
	
	// show one project
	public Project findOneProject(Long id) {
		Optional<Project> optionalProject = projectRepo.findById(id);
		if(optionalProject.isPresent()) {
			return optionalProject.get();
		}else {
			return null;
		}
	}
	
	// delete a project by id
	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}
	
	// Add a user into team
	public Project addUserToTeam(Long projectId, User user) {
		Project project = this.findOneProject(projectId);
		project.getTeammates().add(user);
		return projectRepo.save(project);
	}
	
	//leave a user from a team
	public Project removeUserFromTeam(Long projectId, User user) {
		Project project = this.findOneProject(projectId);
		project.getTeammates().remove(user);
		return projectRepo.save(project);
		
		
	}
	
	
	
}
