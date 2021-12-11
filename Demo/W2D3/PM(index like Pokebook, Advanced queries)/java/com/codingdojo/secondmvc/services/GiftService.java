package com.codingdojo.secondmvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.secondmvc.models.Gift;
import com.codingdojo.secondmvc.repositories.GiftRepository;

@Service
public class GiftService {

	private final GiftRepository giftRepo;
	
	public GiftService(GiftRepository giftRepo) {
		this.giftRepo =  giftRepo;
	}
	
	
	// ****** find all ********
	public List<Gift> allGifts(){
		return giftRepo.findAll();
	}
	
	// ****** CREATE ********
	public Gift addGift(Gift gift) {
		// if the created gift has no id, MySql will create a new instance
		return giftRepo.save(gift);
	}
	
	// ****** SHOW ONE *******
	public Gift findOneGift(Long id) {
		Optional<Gift> optionalGift = giftRepo.findById(id);
		if(optionalGift.isPresent()) {
			return optionalGift.get();
		}else {
			return null;
		}
	}
	
	// ****** EDIT ********
	public Gift editGift(Gift gift) {
		// if the created gift has no id, MySql will create a new instance
		return giftRepo.save(gift);
	}
	
	// ****** DELETE ********
	public void deleteGift(Long id) {
		giftRepo.deleteById(id);
	}
	
	// ****** order By ********
	public List<Gift> searchAllByQuantityOrder(){
		return giftRepo.findTop3ByOrderByQuantityDesc();
	}
	
	// ****** find name containing keyword ********
	public List<Gift> searchByNameContaining(String keyword){
		return giftRepo.findByNameContaining(keyword);
	}
	
	public List<Gift> searchWithNativeQuery(){
		return giftRepo.whateverICall();
	}
	
}







