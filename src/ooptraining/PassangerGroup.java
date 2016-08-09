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
	
}
