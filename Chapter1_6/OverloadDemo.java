class Overload {
	void ovlDemo() {
		System.out.println("Без параметров");
	}

	void ovlDemo(int a) {
		System.out.println("Один параметр: " + a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("Два параметра типа int: " + a +
				" " + b);
		return a + b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("Два параметра типа double: " + a +
				" " + b);
		return a + b;
	}
}

class OverloadDemo {
	public static void main(String[ ] args) {
		Overload ob = new Overload();
		int res1;
		double res2;

		ob.ovlDemo();
		ob.ovlDemo(0);
		res1 = ob.ovlDemo(0, 1);
		res2 = ob.ovlDemo(0., 1.);

		System.out.printf("%d %f\n", res1, res2);
	}
}
