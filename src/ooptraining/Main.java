package ooptraining;

public class Main {

	public static void main(String[] args) {
		
		Trip tripToNY = new Trip();

		Passanger sanyi = new Passanger("S�ndor");
		PassangerGroup pg = new PassangerGroup();
		pg.addPassanger(sanyi);
		tripToNY.book(pg);
		//tripToNY.collectMoney();
		
		
//		tripToNY.go();

	}

}
