package com.codingdojo.firstmvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@NotNull
	@Size(min=2)
	private String name;
	
	@NotNull
	@Min(0)
	private Integer duration;
	
	@NotNull
	@Size(min=2)
	private String genre;

	public Movie() {}
	
	
	public Movie(String name, Integer duration, String genre) {
		this.name = name;
		this.duration = duration;
		this.genre = genre;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Date getCreatedAt() {
		return createdAt;
	}




	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}




	public Date getUpdatedAt() {
		return updatedAt;
	}




	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}




	@Column(updatable=false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;	

	
	@PrePersist
	protected void onCreated() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
    }
	
}
