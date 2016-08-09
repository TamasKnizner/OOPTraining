package ooptraining;

import java.util.ArrayList;
import java.util.List;

public class Itinerary {

	private List<Flight> flights;

	public Itinerary() {
		flights = new ArrayList<>();
	}
	
	public void addFlight(Flight flight) {
		flights.add(flight);
	}
	
	public int getFullPrice() {
		int p = 0;
		for (Flight flight : flights) {
			p += flight.getPrice();
		}
		return p;
	}
	
	public int getFullDistance() {
		int d = 0;
		for (Flight flight : flights) {
			d += flight.getDistance();
		}
		return d;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public List<Flight> getFlights() {
		return flights;
	}
	
	
	
	/*
	public int getProperty(String property) {
		int v = 0;
		for (Flight flight : flights) {
			switch (property) {
				case "distance":
					v += flight.getDistance();
					break;
				case "price":
					v += flight.getPrice();
					break;
				default:
					break;
				}
			}
		return v;
	}*/
	
}
