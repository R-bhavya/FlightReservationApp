package com.FlightReservationApp.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity{
	private boolean checkedIn;
	private int numberOfBags;
	@OneToOne
	private Passenger passengerId;
	@OneToOne
	private Flight flightId;
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(Passenger passengerId) {
		this.passengerId = passengerId;
	}
	public Flight getFlightId() {
		return flightId;
	}
	public void setFlightId(Flight flightId) {
		this.flightId = flightId;
	}
	
}