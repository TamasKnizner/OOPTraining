package ooptraining;

public class DiscountCalculator {

	private final static int SILVER_LIMIT = 19999;
	private final static int GOLD_LIMIT = 49999;
	
	
	public static int calculateDiscount(PassangerGroup pg) {
		int sum = 0;
		for (Passanger p : pg.getPassangers()) {
			sum += getPassangerDiscount(p);
		}
		return sum / pg.getPassangers().size();
	}
	
	private static int getPassangerDiscount(Passanger p) {
		int discount = 0;
		if(p.getMiles() > SILVER_LIMIT) {
			discount = 2;
		} else if(p.getMiles() > GOLD_LIMIT) {
			discount = 3;
		}
		return discount;
	}
	
}
