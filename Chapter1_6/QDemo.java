class Queue {
	private int[ ] array;
	private int putloc, getloc;

	public Queue(int size) {
		array = new int[size];
		putloc = getloc = 0;
	}

	public Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		array = new int[ob.array.length];

		for (int i = getloc; i < putloc; i++)
			array[i] = ob.array[i];
	}

	public Queue(int[ ] a) {
		putloc = 0;
		getloc = 0;
		array = new int[a.length];

		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}

	public void put(int val) {
		if (putloc == array.length) {
			System.out.println("Очередь заполнена");
			return;
		}

		array[putloc++] = val;
	}

	public int get() {
		if (getloc == putloc) {
			System.out.println("Очередь пуста");
			return -1;
		}

		return array[getloc++];
	}
}

class QDemo {
	public static void main(String[ ] args) {
		Queue q1 = new Queue(5);
		int[ ] a = {1, 2, 3};
		Queue q2 = new Queue(a);

		for (int i = 0; i < 5; i++)
			q1.put(i);

		Queue q3 = new Queue(q1);

		for (int i = 0; i < 5; i++)
			System.out.println(q1.get());
		System.out.println();

		for (int i = 0; i < 5; i++)
			System.out.println(q3.get());
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.println(q2.get());
		System.out.println();
	}
}
