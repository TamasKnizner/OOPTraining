package ooptraining;

public class Flight {

	private String destination;
	private int price;
	private int distance;
	
	public Flight(String destination, int price, int distance) {
		super();
		this.destination = destination;
		this.price = price;
		this.distance = distance;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	
	
}
