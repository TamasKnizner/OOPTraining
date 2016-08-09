package ooptraining;

public class DiscountCalculator {

	private final static int SILVER_LIMIT = 19999;
	private final static double SILVER_DISCOUNT = 0.8;
	private final static int GOLD_LIMIT = 49999;	
	private final static double GOLD_DISCOUNT = 0.7;
	
	
	public static int calculateDiscount(PassangerGroup pg) {
		int sum = 0;
		for (Passanger p : pg.getPassangers()) {
			sum += getPassangerDiscount(p);
		}
		return sum / pg.getPassangers().size();
	}
	
	private static double getPassangerDiscount(Passanger p) {
		double discount = 1.0;
		if(p.getMiles() > SILVER_LIMIT) {
			discount = SILVER_DISCOUNT;
		} else if(p.getMiles() > GOLD_LIMIT) {
			discount = GOLD_DISCOUNT;
		}
		return discount;
	}
	
}
