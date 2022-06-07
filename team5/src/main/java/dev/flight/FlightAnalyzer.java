package dev.flight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.flight.data.FlightParser;
import dev.flight.domain.Flight;
import dev.flight.service.FlightProcessor;

@Service
public class FlightAnalyzer {
	private static final String RESOURCES = "src/main/resources/";

	private final FlightParser parser;

	@Autowired
	public FlightAnalyzer(FlightParser parser) {
		this.parser = parser;
	}

	public void analyze(String fileName) throws IOException {
		final Path path = Paths.get(RESOURCES + fileName);
		final List<String> lines = Files.readAllLines(path);

		List<Flight> flights = parser.parseLinesFrom(lines);
		FlightProcessor processor = new FlightProcessor(flights);
		selectFlight(processor);
	}
	private static void selectFlight(FlightProcessor processor) {
		System.out.println(processor.bestFlightMonth(Month.AUGUST));
	}
}
