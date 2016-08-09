package ooptraining;

import java.util.ArrayList;
import java.util.List;

public class PassangerGroup implements PassangerInf{
	
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

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void book() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
