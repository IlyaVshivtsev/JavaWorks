class MyClass {
	int x;

	MyClass() {
		System.out.println("Внутри MyClass()");
	}

	MyClass(int i) {
		System.out.println("Внутри MyClass(int)");
		x = i;
	}

	MyClass(double d) {
		System.out.println("Внутри MyClass(double)");
		x = (int) d;
	}

	MyClass(int i, int j) {
		System.out.println("Внутри MyClass(int, int)");
		x = i * j;
	}
}

class OverloadConsDemo {
	public static void main(String[ ] args) {
		MyClass t;

		t = new MyClass();
		t = new MyClass(1);
		t = new MyClass(1.);
		t = new MyClass(1, 3);
	}
}
