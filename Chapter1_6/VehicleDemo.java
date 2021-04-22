class Vehicle {
	int passengers; // количество пассажиров
	int fuelcap;	// ёмкость топливного бака
	int mpg;	// потребление топлива в милях на галлон

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
}

class VehicleDemo {
	public static void main(String[ ] args) {
		Vehicle minivan = new Vehicle(7, 16, 21);
		Vehicle sportscar = new Vehicle(2, 14, 12);

		System.out.println("Мини-фургон может перевезти " +
				minivan.passengers + " пассажиров на расстояние " +
				minivan.range() + " миль");
		System.out.println("Спортивный автомобиль может перевезти " +
				sportscar.passengers + " пассажиров на расстояние " +
				sportscar.range() + " миль");
	}
}
