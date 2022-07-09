package com.coolcoder.spring.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coolcoder.spring.location.entities.Location;

public interface LocationRepo extends JpaRepository<Location, Integer> {

}
