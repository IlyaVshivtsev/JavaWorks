// класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
	private char q[]; // массив для хранения элементов очереди
	private int putloc, getloc; // индексы вставляемого
				// и извлекаемого элемента

	// создание пустой очереди заданного размера
	public FixedQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}

	public void
