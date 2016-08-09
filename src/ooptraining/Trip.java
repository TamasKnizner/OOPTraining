package ooptraining;

import java.util.List;

public class Trip {
	
	private List<PassangerGroup> tripMembers;
	private Itinerary itinerary;
	private int fullPrice;
	
	public void book(PassangerGroup newPassangerGroup) {
		tripMembers.add(newPassangerGroup);
	}
	
	public void cancel(PassangerGroup passangerGroup) {
		if(tripMembers.contains(passangerGroup)){
			tripMembers.remove(passangerGroup);
		}
	}

	public void setItinerary(Itinerary itinerary) {
		this.itinerary = itinerary;
	}
	
	public void buyTickets() {
		for(Flight f : itinerary.getFlights()) {
			for(PassangerGroup pg : tripMembers) {
				//pg.buyTicket()
				fullPrice += f.getPrice() * DiscountCalculator.calculateDiscount(pg);
			}
		}
	}
	
	
	

}
