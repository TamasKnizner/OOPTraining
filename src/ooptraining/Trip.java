package ooptraining;

import java.util.ArrayList;
import java.util.List;

public class Trip {
	
	private List<PassangerGroup> tripMembers;
	private Itinerary itinerary;
	private int fullPrice;
	private String nameOfTrip;
	
	
	
	public Trip(String nameOfTrip) {
		super();
		this.nameOfTrip = nameOfTrip;
		this.tripMembers = new ArrayList<>();
	}

	public void book(PassangerGroup newPassangerGroup) {		
		tripMembers.add(newPassangerGroup);
		newPassangerGroup.bookAll();
	}
	
	public void cancel(PassangerGroup passangerGroup) {
		if(tripMembers.contains(passangerGroup)){
			tripMembers.remove(passangerGroup);
			passangerGroup.unBookAll();
		}
		
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	
	public void buyTickets() {
		for(PassangerGroup pg : tripMembers) {
			for(Flight f : itinerary.getFlights()) {
				fullPrice += f.getPrice() * DiscountCalculator.calculateDiscount(pg);
			}
			pg.updateMiles(itinerary.getFullDistance());
		}
	}
	
	
	public String createTicket() {
		String ticket = "";
		ticket += "Trip to: " + nameOfTrip + System.lineSeparator();
		ticket += "------------------------------------ " + System.lineSeparator();
		
		ticket += "Stop points: " + System.lineSeparator();
		
		ticket += "------------------------------------ " + System.lineSeparator();
		
		for(Flight flight : itinerary.getFlights()) {
			ticket += flight.getDestination() + System.lineSeparator();
		}
		ticket += this.nameOfTrip + System.lineSeparator();
		
		ticket += "------------------------------------ " + System.lineSeparator();
		
		ticket += "Passangers: " + System.lineSeparator();
		
		for (PassangerGroup passangerGroup : tripMembers) {
			/*for (Passanger passanger : passangerGroup.getPassangers()) {
				ticket += passanger.getName() + System.lineSeparator();
			}*/
			ticket += passangerGroup.getPassangerList();
		}
		
				
		ticket += "------------------------------------ " + System.lineSeparator();
		ticket += "Total: " + fullPrice  + " HUF" + System.lineSeparator();
		
		return ticket;
	}

}
