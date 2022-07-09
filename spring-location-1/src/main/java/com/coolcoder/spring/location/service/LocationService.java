package com.coolcoder.spring.location.service;

import java.util.List;

import com.coolcoder.spring.location.entities.Location;


public interface LocationService {

		Location saveLocation(Location location);
		
		Location updateLocation(Location location);

		void deleteLocation(Location location);
		
		Location getLocatioById(int id);
		
		List<Location> getAllLocation();

}
