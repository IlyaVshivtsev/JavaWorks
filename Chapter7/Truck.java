// класс грузовиков (наследует Vehicle)
public class Truck extends Vehicle {
	private int cargocap; // грузоподъёмность в фунтах

	Truck(int p, int f, int m, int c) {
		super(p, f, m);
		cargocap = c;
	}

	int getCargo() { return cargocap; }
	void setCargo(int c) { cargocap = c; }
}
