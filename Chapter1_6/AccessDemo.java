class MyClass {
	private int alpha;
	public int beta;
	int gama;

	void setAlpha(int a) {
		alpha = a;
	}

	int getAlpha() {
		return alpha;
	}
}

class AccessDemo {
	public static void main(String[ ] args) {
		MyClass obj = new MyClass();

		obj.setAlpha(100);
		System.out.println(obj.getAlpha());

		//obj.alpha = 10;
		obj.beta = 10;
		obj.gama = 10;
	}
}
