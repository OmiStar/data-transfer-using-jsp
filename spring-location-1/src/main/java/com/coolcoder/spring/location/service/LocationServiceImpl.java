package com.coolcoder.spring.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coolcoder.spring.location.entities.Location;
import com.coolcoder.spring.location.repository.LocationRepo;


@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepo repo;

	@Override
	public Location saveLocation(Location location) {
		return repo.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repo.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
			repo.delete(location);		
	}

	@Override
	public Location getLocatioById(int id) {
		return repo.findById(id).get();
		
	}

	@Override
	public List<Location> getAllLocation() {
		return repo.findAll();
	}

}
