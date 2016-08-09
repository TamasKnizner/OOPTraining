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
	
	/*@Override
	public void pay() {
		for(Passanger passanger : passangers) {
			passanger.pay();
		}
	}*/
	
	public void updateMiles(int distance) {
		for (Passanger passanger : passangers) {
			System.out.println("asd");
			passanger.setMiles(passanger.getMiles() + distance);
		}
	}
	
	public String getPassangerList() {
		String list = "";
		for (Passanger passanger : passangers) {
			list += passanger.getName() + System.lineSeparator();
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
