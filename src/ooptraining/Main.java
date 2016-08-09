package ooptraining;

public class Main {

	public static void main(String[] args) {
		
		PassangerGroup group1 = PassangerGroupCreator("Sanyi", "Mari", "Géza");
		PassangerGroup group2 = PassangerGroupCreator("Carlos", "Jose", "Consuela");
		
		Trip tripToNY = new Trip("Ibiza");
		Itinerary itinerary = new Itinerary();
		itinerary.addFlight(new Flight("Budapest", 10340, 200));
		itinerary.addFlight(new Flight("London", 13400, 400));
		itinerary.addFlight(new Flight("Kenya", 132400, 800));
		itinerary.addFlight(new Flight("Maris Neni", 102340, 500));
		tripToNY.setItinerary(itinerary);
		tripToNY.book(group1);
		tripToNY.book(group2);
		tripToNY.cancel(group1);
		tripToNY.buyTickets();
		System.out.println(tripToNY.createTicket());   
	}
	
	private static PassangerGroup PassangerGroupCreator (String... args) {
		PassangerGroup pg = new PassangerGroup();
		for (String string : args) {
			pg.addPassanger(new Passanger(string));
		}
		return pg;
	}

}
