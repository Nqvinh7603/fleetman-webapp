package com.nqvinh.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nqvinh.controllers.Position;

@FeignClient(name="fleetman-position-tracker")
public interface RemotePositionMicroserviceCalls 
{
	// REST Call
	// /vehicles/{name}
	@RequestMapping(method=RequestMethod.GET, value="/vehicles/{name}")
	public Position getLatestPositionForVehicle(@PathVariable("name") String name);
}
