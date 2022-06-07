package dev.flight;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dev.flight.data.FlightCSVParser;

public class MainApplication {
	public static void main(String[] args) throws IOException {
		final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FlightFactory.class);
		final FlightAnalyzer analyzer = applicationContext.getBean(FlightAnalyzer.class);
		FlightCSVParser bean = applicationContext.getBean(FlightCSVParser.class);
		analyzer.analyze("flight.csv");
	}
}
