package ooptraining;

public class Passanger {
	
	private int miles;
	private String name;
	private boolean isBooked;
	
	public Passanger(String name) {
		this.name = name;
		this.isBooked = false;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}


	/*@Override
	public void pay() {
		
	}*/

	public int getMiles() {
		return miles;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	
	
	

}
