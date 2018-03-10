package testing;

public class Class_Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		plain Boeing = new plain(550, 0.85, 48070, 750);// creates plain object
														// for class plain
		plain F35 = new plain(1, 1.6, 18498, 510);

		System.out.println(
				"For a Boeing to stay aloft for 4.2 hours it takes " + Boeing.fuelNeeded(4.4) + " gallons of fuel.");

		System.out.println(
				"For a F35 to stay aloft for 2.14 hours it takes " + F35.fuelNeeded(2.14) + " gallons of fuel.");
	}

}

class plain {
	int people;// passengers and crew and so on
	double speed;// mach
	double fuelCap;// gallons an hour
	double fuelBurnRate;// gallons an hour

	plain(int p, double s, double fc, double fbr) {
		people = p;
		speed = s;
		fuelCap = fc;
		fuelBurnRate = fbr;
	}

	double CalEndurence() {
		double endurence;

		endurence = fuelCap / fuelBurnRate;

		System.out.println("The Endurence is " + endurence + "hours.");
		return endurence;
	}

	double fuelNeeded(double time) {
		return fuelBurnRate * time;
	}
}
