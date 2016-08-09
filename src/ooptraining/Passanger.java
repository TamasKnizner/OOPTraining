package ooptraining;

public class Passanger {
	
	private int miles;
	private String name;
	
	public Passanger(String name) {
		this.name = name;
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
	
	

}
