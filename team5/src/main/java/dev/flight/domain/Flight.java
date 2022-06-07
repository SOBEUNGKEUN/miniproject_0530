package dev.flight.domain;

import java.time.LocalDate;

public class Flight {

	private String flightNumber;
	private LocalDate depDate;
	private String destination;
	private String airline;

	public Flight(String flightNumber, LocalDate depDate, String destination, String airline) {
		this.flightNumber = flightNumber;
		this.depDate = depDate;
		this.destination = destination;
		this.airline = airline;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public LocalDate getDepDate() {
		return depDate;
	}

	public void setDepDate(LocalDate depDate) {
		this.depDate = depDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", depDate=" + depDate + ", destination=" + destination
				+ ", airline=" + airline + "]";
	}

}
