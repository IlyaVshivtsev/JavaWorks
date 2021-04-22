class FailSoftArray {
	private int[ ] a;
	private int errval;

	public int length;

	public FailSoftArray(int size, int errv) {
		a = new int[size];
		length = size;
		errval = errv;
	}

	public int get(int index) {
		return indexOk(index) ? a[index] : errval;
	}

	public boolean put(int index, int val) {
		if (indexOk(index)) {
			a[index] = val;
			return true;
		}
		else
			return false;
	}

	private boolean indexOk(int index) {
		return (0 <= index) && (index < length);
	}
}

class FSDemo {
	public static void main(String[ ] args) {
		FailSoftArray fs = new FailSoftArray(5, -1);
		int x;

		for (int i = 0; i < fs.length * 2; i++)
			System.out.println(fs.put(i, 10*i));

		for (int i = 0; i < fs.length * 2; i++)
			System.out.println(fs.get(i));
	}
}
