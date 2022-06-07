package dev.flight.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.flight.domain.FlightDB;

@RestController
public class FlightController {
	private FlightDB flightInfo;
	final List<FlightDB> flightInfos = new ArrayList<>();

	@RequestMapping(value = "/flights")
	public List<FlightDB> flightView() throws SQLException {
		String jdbcDriver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://localhost:3306/team0530?serverTimezone=Asia/Seoul";
		FlightDB flightDB = new FlightDB();
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection(jdbcUrl, "root", "1234");
			Statement st = con.createStatement();
			String sql = "SELECT * FROM flight";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				flightDB.setId(rs.getInt(1));
				flightDB.setFlightNumber(rs.getString(2));
				flightDB.setDepDate(rs.getString(3));
				flightDB.setDestination(rs.getString(4));
				flightDB.setAirline(rs.getString(5));
				flightInfo = new FlightDB(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				flightInfos.add(flightInfo);
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flightInfos;
	}
	@RequestMapping(value = "/insert", method=RequestMethod.POST)
	public void flightInsert(@RequestParam("id") int id, @RequestParam("flightNumber") String flightNumber,
			@RequestParam("depDate") String depDate, @RequestParam("destination") String destination,
			@RequestParam("airline") String airline) throws SQLException {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("POST");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
	
		try {
			tx.begin();
			FlightDB flightInfo = new FlightDB();
			flightInfo.setId(id);
			flightInfo.setFlightNumber(flightNumber);
			flightInfo.setDepDate(depDate);
			flightInfo.setDestination(destination);
			flightInfo.setAirline(airline);		
			em.persist(flightInfo);			
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			em.close();
			emf.close();
		}		
	}
}