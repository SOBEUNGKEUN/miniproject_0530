package dev.flight.domain;

public class FlightDB {

	private int id;
	private String flightNumber;
	private String depDate;
	private String destination;
	private String airLine;

	public FlightDB(int id, String flightNumber, String depDate, String destination, String airLine) {
		this.id = id;
		this.flightNumber = flightNumber;
		this.depDate = depDate;
		this.destination = destination;
		this.airLine = airLine;
	}

	public FlightDB() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDepDate() {
		return depDate;
	}

	public void setDepDate(String depDate) {
		this.depDate = depDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAirline() {
		return airLine;
	}

	public void setAirline(String airLine) {
		this.airLine = airLine;
	}

}
