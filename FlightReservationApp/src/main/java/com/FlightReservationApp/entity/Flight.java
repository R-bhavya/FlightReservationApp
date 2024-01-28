package com.FlightReservationApp.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{
	private String flightNumber;
	private String operatingAirlines;
	private String depatureCity;
	private String arrivalCity;
	private Date dateOfDepature;
	private Timestamp estimatedDepatureTime;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirlines() {
		return operatingAirlines;
	}
	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}
	public String getDepatureCity() {
		return depatureCity;
	}
	public void setDepatureCity(String depatureCity) {
		this.depatureCity = depatureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDepature() {
		return dateOfDepature;
	}
	public void setDateOfDepature(Date dateOfDepature) {
		this.dateOfDepature = dateOfDepature;
	}
	public Timestamp getEstimatedDepatureTime() {
		return estimatedDepatureTime;
	}
	public void setEstimatedDepatureTime(Timestamp estimatedDepatureTime) {
		this.estimatedDepatureTime = estimatedDepatureTime;
	}
	
	
}
