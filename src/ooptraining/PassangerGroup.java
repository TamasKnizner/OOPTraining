package ooptraining;

import java.util.ArrayList;
import java.util.List;

public class PassangerGroup {
	
	private List<Passanger> passangers;
	
	
	public PassangerGroup() {
		passangers = new ArrayList<Passanger>();
	}
	
	public void addPassanger(Passanger passanger) {
		passangers.add(passanger);
	}

	public List<Passanger> getPassangers() {
		return passangers;
	}

	public int getNumberOfPeople() {
		return passangers.size();
	}
	
	public void updateMiles(int distance) {
		for (Passanger passanger : passangers) {
			passanger.setMiles(passanger.getMiles() + distance);
		}
	}
	
	public String getPassangerList() {
		String list = "";
		for (Passanger passanger : passangers) {
			list += passanger.getName() + " miles: " + passanger.getMiles()  + " discount: " + DiscountCalculator.calculateDiscount(this) +  System.lineSeparator();
		}
		return list;
	}
	
	public void bookAll() {
		for (Passanger passanger : passangers) {
			passanger.setBooked(true);
		}
	}

	public void unBookAll() {
		for (Passanger passanger : passangers) {
			passanger.setBooked(false);
		}		
	}
}
