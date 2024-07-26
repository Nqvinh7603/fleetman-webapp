package com.nqvinh.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nqvinh.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>
{
	public Vehicle findByName(String name);
} 
