class ForTest {
	public static void main(String[ ] args)
		throws java.io.IOException {

		for (int i = 0; (char) System.in.read() != 'S'; i++)
			System.out.println(i);
	}
}
