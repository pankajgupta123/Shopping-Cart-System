package com.profile.userprofile.daolayer;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.profile.userprofile.model.UserProfile;

@Service
public interface ProfileService {
	
	//public UserProfile addNewCustomerProfile();
	//public UserProfile updateProfile();
	public List <UserProfile> getAllProfiles(); 
	public Optional<UserProfile> getByProfile(int profileId);
	public  String deleteProfile(int profileId);
	public  UserProfile addNewMerchantProfile( UserProfile userprofile);
	public UserProfile addNewDeliverProfile(UserProfile userprofile);
	//public Long  findByMobileNo(Long mobileNo);
	public String getByUserName();
	public UserProfile addNewCustomerProfile(UserProfile userprofile);
	 public String updateProfile(UserProfile userprofile,int profileId);
	
	public Optional<UserProfile> findByMobileNo(Long mobileNo);
	
	
	

}