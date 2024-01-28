package com.FlightReservationApp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FlightReservationApp.repository.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping("/findFlights")
	public String findFlights(@RequestParam("from") String from,@RequestParam("to") String to,@RequestParam("depatureDate") @DateTimeFormat(pattern = "MM-dd-YYYY") Date depatureDate,ModelMap modelMap) {
		//flightRepository.findFlights(from,to,depatureDate);
		return "";
	}
}
