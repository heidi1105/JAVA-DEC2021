package com.codingdojo.manytomanydemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.manytomanydemo.models.Treat;

@Repository
public interface TreatRepository extends CrudRepository<Treat, Long> {
	List<Treat> findAll();
}
