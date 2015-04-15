public class Set {

	private String[] mass;
	private int over;
	private int size;

	public Set(int val) {

		mass = new String[val];
		size = 0;
		over = val;
	}

	public boolean add(String val, Function f) {
		if (over == size) {
			int new_size = (3 * size / 2) + 1;
			String[] resize = new String[new_size];
			for (int i = 0; i < size; i++) {
				resize[i] = mass[i];

			}
			over = new_size;
			mass = resize;

		}

		int i = 0;
		String k = new String();

		do {

			k = mass[i];
			i++;

		} while ((f.f(k, val) != true) && (i < size + 1));

		if (val != mass[i - 1]) {

			mass[size] = val;

			size = size + 1;

			return true;
		} else

			return false;

	}

	public boolean search(String val, Function f) {

		int i = 0;
		String k;
		do {
			k = mass[i];
			i++;
		} while ((f.f(k, val) != true) && (i < size + 1));

		if (f.f(k, val) != true)
			return false;

		else

			return true;
	}

	public boolean remove(String val, Function f) {
		String j;
		int i = 0;
		do {

			j = mass[i];

			i++;
		}

		while ((f.f(j, val) != true) && (i < size + 1));

		if (f.f(j, val) != true)

			return false;

		else {
			i = 0;
			boolean k;

			do {
				k = (f.f(val, mass[i]));
				i++;
			}

			while ((k == false) & (i - 1 < size));

			mass[i - 1] = null;
			return true;

		}
	}

	public int size() {

		return size;
	}

	public boolean isEmpty() {
		if (size != 0)
			return false;
		else
			return true;

	}

}
