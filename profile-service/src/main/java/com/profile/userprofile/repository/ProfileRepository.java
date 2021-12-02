package com.profile.userprofile.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.profile.userprofile.model.UserProfile;

public interface ProfileRepository extends MongoRepository <UserProfile , Integer>{
	
	//user profile is for data collection
		Optional<UserProfile> findByMobileNumber(Long mobileNumber);
		
		Optional<UserProfile> findByEmail(String email);
		
		//optional is used for any op except crud
		
	}