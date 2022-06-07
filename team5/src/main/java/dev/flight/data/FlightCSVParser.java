package dev.flight.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import dev.flight.domain.Flight;

@Component("parser")
public class FlightCSVParser implements FlightParser {

	private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("yy-MM-dd");

	public Flight parseFrom(String line) {
		String[] columns = line.split(",");

		final String flightNumber = columns[0];
		final LocalDate depDate = LocalDate.parse(columns[1], DATE_PATTERN);
		final String destination = columns[2];
		final String airline = columns[3];

		return new Flight(flightNumber, depDate, destination, airline);
	}

	public List<Flight> parseLinesFrom(List<String> lines) {
		List<Flight> flights = new ArrayList<>();

		for (String line : lines) {
			Flight flight = parseFrom(line);
			flights.add(flight);
		}
		return flights;
	}

}
