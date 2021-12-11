package com.codingdojo.secondmvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.secondmvc.models.Gift;

@Repository
public interface GiftRepository extends CrudRepository<Gift, Long>{
	List<Gift> findAll();

	List<Gift> findAllByOrderByQuantityDesc();
	
	List<Gift> findTop3ByOrderByQuantityDesc();
	
	List<Gift> findByNameContaining(String keyword);
	//SELECT * FROM GIFTS WHERE NAME="STH" 
	
	
	@Query(value="SELECT * FROM gifts", nativeQuery=true)
	List<Gift> whateverICall();
	
}
