class StaticBlock {
	public static double rootOf3;
	static public double rootOf2;

	static {
		System.out.println("Внутри статического блока");
		rootOf2 = Math.sqrt(2);
		rootOf3 = Math.sqrt(3);
	}

	public StaticBlock(String msg) {
		System.out.println(msg);
	}
}

class SDemo3 {
	public static void main(String[ ] args) {
//		StaticBlock ob = new StaticBlock("Внутри конструктора");

		System.out.println(StaticBlock.rootOf2);
		System.out.println(StaticBlock.rootOf3);
	}
}
