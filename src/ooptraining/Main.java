package ooptraining;

public class Main {

	public static void main(String[] args) {
		Passanger sanyi = new Passanger("Sándor");
		PassangerGroup pg = new PassangerGroup();
		pg.addPassanger(sanyi);
		Trip tripToNY = new Trip("Ibiza");
		Itinerary itinerary = new Itinerary();
		itinerary.addFlight(new Flight("Budapest", 10340, 200));
		itinerary.addFlight(new Flight("London", 13400, 400));
		itinerary.addFlight(new Flight("Kenya", 132400, 800));
		itinerary.addFlight(new Flight("Maris Neni", 102340, 78000));
		tripToNY.setItinerary(itinerary);
		tripToNY.book(pg);
		tripToNY.buyTickets();
		System.out.println(tripToNY.createTicket());   
	}

}
