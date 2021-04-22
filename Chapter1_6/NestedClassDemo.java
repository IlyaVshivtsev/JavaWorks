class Outer {
	int nums[];

	Outer(int n[]) {
		nums = n;
	}

	void analyze() {
		Inner ob = new Inner();

		System.out.println("Минимум: " + ob.min());
		System.out.println("Максимум: " + ob.max());
		System.out.println("Среднее: " + ob.avg());
	}

	class Inner {
		int min() {
			int m = nums[0];

			for (int i = 1; i < nums.length; i++)
				m = nums[i] < m ? nums[i] : m;

			return m;
		}

		int max() {
			int m = nums[0];

			for (int i = 1; i < nums.length; i++)
				m = m < nums[i] ? nums[i] : m;

			return m;
		}

		int avg() {
			int a = 0;

			for (int num: nums)
				a += num;
			return a / nums.length;
		}
	}
}

class NestedClassDemo {
	public static void main(String[ ] args) {
		int[ ] x = {1, 2, 3, 4, 5};

		Outer ob = new Outer(x);

		ob.analyze();
	}
}
