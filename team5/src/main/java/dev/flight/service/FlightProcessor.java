package dev.flight.service;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import dev.flight.domain.Flight;

public class FlightProcessor {
	private final List<Flight> flights;

	public FlightProcessor(List<Flight> flights) {
		this.flights = flights;
		return;
	}

	public List<Flight> bestFlightMonth(Month month) {

		final List<Flight> flightInMonth = new ArrayList<>();

		for (Flight flight : flights) {
			if (flight.getDepDate().getMonth() == month) {
				flightInMonth.add(flight);
			}
		}
		return flightInMonth;
	}

}
