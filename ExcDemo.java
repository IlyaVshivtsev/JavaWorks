class ExcDemo {
	public static void main(String[ ] args) {
		int[ ] nums = new int[4];

		try {
			System.out.println("Before exception generation");
			nums[0] = 1;
			System.out.println("This string isn't showed");
		}
		catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Error");
		}
		System.out.println("After catch");
	}
}
