package com.FlightReservationApp.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.FlightReservationApp.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long>{

	void findFlights();
    
	//@Query("from Flight where departureCity=:departureCity and arrivality=:arrivalCity and ")
	// List<Flight>findFlights( @Param("departureCity")String from, @Param("arrivalCity") String to, @Param("Date depatureDate");

}
