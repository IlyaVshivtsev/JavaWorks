class NotHandled {
	public static void main(String[ ] args) {
		int[ ] nums = new int[4];

		System.out.println("Before exception generation");
		
		nums[4] = 0;

		System.out.println("After exception generation");
	}
}
