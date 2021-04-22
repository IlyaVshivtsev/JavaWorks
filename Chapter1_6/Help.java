class Help {
	public static void main(String[ ] args)
		throws java.io.IOException {

		char choice, ignore;
		
		do {
			System.out.println("Справка:");
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. for");
			System.out.println("4. while");
			System.out.println("5. do-while");
			System.out.println("6. Выход");
			System.out.print("Выберите:");

			choice = (char) System.in.read();

			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

			switch (choice) {
				case '1':
					System.out.println("Инструкция if: ...");
					break;
				case '2':
					System.out.println("Инструкция switch: ...");
					break;
				default:
					System.out.println("Запрос не найден");
					break;
			}
		} while (choice != '6');
	}
}
