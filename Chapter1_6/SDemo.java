class StaticDemo {
	int x;
	static int y;

	int sum() {
		return x + y;
	}
}

class SDemo {
	public static void main(String[ ] args) {
		StaticDemo ob1 = new StaticDemo();
		StaticDemo ob2 = new StaticDemo();

		ob1.x = 10;
		ob2.x = 20;

		System.out.println(ob1.x);
		System.out.println(ob2.x);

		StaticDemo.y = 30;
		System.out.println(StaticDemo.y);

		System.out.println(ob1.sum());
		System.out.println(ob2.sum());

		ob1.y = 40;
		System.out.println(ob1.sum());
		System.out.println(ob2.sum());
	}
}
