/*
 * Упражнение 1.1
 *
 * Программа перевода галлонов в литры.
 *
*/

class GalToLit {
	public static void main(String[ ] args) {
		double gallons;	// В этой переменной хранится значение,
				// выраженное в галлонах
		double liters;	// В этой переменной хранится значение,
				// выраженное в литрах
		gallons = 10.;
		
		liters = gallons * 3.7854;

		System.out.println(gallons + " галлонам соответсвует " +
				liters + " литров");
	}
}
