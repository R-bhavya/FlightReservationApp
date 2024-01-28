package com.FlightReservationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FlightReservationApp.entity.User;

public interface ReservationRepository extends JpaRepository<User,Long>{

}
