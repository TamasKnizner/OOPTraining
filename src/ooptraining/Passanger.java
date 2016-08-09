package ooptraining;

import java.util.Random;

public class Passanger {
	
	private int miles;
	private String name;
	private boolean isBooked;
	private Random random = new Random();
	
	public Passanger(String name) {
		this.name = name;
		this.isBooked = false;
		this.miles = random.nextInt(55000 - 500) + 500;
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
