public class Vehicle {
	private int passengers; // количество пассажиров
	private int fuelcap;	// ёмкость топливного бака
	private int mpg;	// потребление топлива в милях на галлон

	// Конструктор класса
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelcap = f;
		mpg = m;
	}

	// Возврат дальности поездки 
	int range() {
		return fuelcap * mpg;
	}

	// Расчёт объёма топлива, необходимого
	// для преодоления заданного расстояния
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}

	int getPassengers() { return passengers; }
	int getFuelcap() { return fuelcap; }
	int getMpg() {return mpg; }
}
