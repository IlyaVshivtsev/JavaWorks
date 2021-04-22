class Block {
	int a, b, c;
	int volume;

	Block(int i, int j, int k) {
		a = i;
		b = j;
		c = k;
		volume = a * b * c;
	}

	boolean equals(Block ob) {
		return (ob.a == a) && (ob.b == b) && (ob.c == c);
	}

	boolean sameVolume(Block ob) {
		return (ob.volume == volume);
	}
}

class PassOb {
	public static void main(String[ ] args) {
		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);

		System.out.println(ob1.equals(ob2));
		System.out.println(ob2.equals(ob3));
		System.out.println(ob2.sameVolume(ob3));
	}
}
