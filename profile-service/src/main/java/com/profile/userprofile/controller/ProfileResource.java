package com.profile.userprofile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profile.userprofile.daolayer.ProfileServiceImpl;
import com.profile.userprofile.model.UserProfile;

@RestController
@RequestMapping("/userprofile")
public class ProfileResource {

     @Autowired
     ProfileServiceImpl proService;
	
	@PostMapping("/addcustomer")
    public UserProfile addNewCustomerProfile(@RequestBody UserProfile userProfile) {
		return proService.addNewCustomerProfile(userProfile);
	}
	@PostMapping("/addmerchant")
    public UserProfile addNewMerchantProfile(@RequestBody UserProfile userProfile) {
		return proService.addNewMerchantProfile(userProfile);
	}
	@PostMapping("/adddelivery")
    public UserProfile addNewDeliveryProfile(@RequestBody UserProfile userProfile) {
		return proService.addNewDeliverProfile(userProfile);
	}
    
    public List <UserProfile> getAllProfiles() {
		return null;
	}
    @GetMapping("/getprofile/{profileId}")
     public Optional<UserProfile> getByProfile(@PathVariable("profileId")int profileId) {
		return proService.getByProfile(profileId);
	}
     
     @PutMapping("/update/{profileId}")
     public String updateProfile(@RequestBody UserProfile userprofile,@PathVariable("profileId") int profileId) {
    	 proService.getByProfile(profileId);
    	 proService.addNewCustomerProfile(userprofile);
    	 return "update :"+profileId;
	}
     @DeleteMapping("/delete/{profileId}")
     public String deleteProfile(@PathVariable("profileId") int profileId) {
    	 proService.deleteProfile(profileId);
    
		return "deleted profile:"+profileId;
		
	}
     
    public UserProfile getByUserName() {
		return null;
	}
    
}
