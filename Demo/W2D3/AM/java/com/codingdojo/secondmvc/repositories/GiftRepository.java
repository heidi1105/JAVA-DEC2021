package com.codingdojo.secondmvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.secondmvc.models.Gift;

@Repository
public interface GiftRepository extends CrudRepository<Gift, Long>{
	List<Gift> findAll();

}
