// класс, описывающий двумерные объекты
class TwoDShape {
	private double width;
	private double height;

	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}

	// методы доступа к переменным width и height
	double getWidth() { return width; }
	double getHeight() { return height; }
	void setWidth(double w) { width = w; }
	void setHeight(double h) { height = h; }

	void showDim() {
		System.out.println("Ширина и высота: " + width
				+ ", " + height);
	}
}

// подкласс, описывающий треугольники
class Triangle extends TwoDShape {
	private String style;

	Triangle(String s, double w, double h) {
		super(w, h); // вызов конструктора суперкласса

		style = s;
	}

	double area() {
		return getWidth() * getHeight() / 2.;
	}

	void showStyle() {
		System.out.println("Треугольник " + style);
	}
}

class Shapes {
	public static void main(String[ ] args) {
		Triangle t1 = new Triangle("Закрашенный", 4., 4.);
		Triangle t2 = new Triangle("Контурный", 8., 12.);

		System.out.println("Информация о треугольнике t1:");
		t1.showDim();
		t1.showStyle();
		System.out.println("Площадь: " + t1.area());

		System.out.println();

		System.out.println("Информация о треугольнике t2:");
		t2.showDim();
		t2.showStyle();
		System.out.println("Площадь: " + t2.area());
	}
}
