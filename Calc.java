package fuel;

public class Calc {
	double way;
	double average;
	double price;
	double fuel;
	double cost;

	Calc(double way, double average, double price) {
		this.fuel = average / 100.0 * way;
		this.cost = fuel * price;
	}

	public String getFuel() {
		return Double.toString(fuel);
	}

	public String getCost() {
		return Double.toString(cost);
	}
}
