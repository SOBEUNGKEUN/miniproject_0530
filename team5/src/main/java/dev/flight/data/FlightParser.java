package dev.flight.data;

import java.util.List;

import dev.flight.domain.Flight;

public interface FlightParser {
	Flight parseFrom(String line);
	List<Flight> parseLinesFrom(List<String> lines);
}
