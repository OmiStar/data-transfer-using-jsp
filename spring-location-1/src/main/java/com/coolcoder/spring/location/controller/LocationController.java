package com.coolcoder.spring.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coolcoder.spring.location.entities.Location;
import com.coolcoder.spring.location.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService service;
	
	@RequestMapping("/show")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location saveLocation = service.saveLocation(location);
		String msg="Location Saved with Id : "+ saveLocation.getId();
		modelMap.addAttribute("msg",msg);
		
		return "createLocation";
	}
	

}
