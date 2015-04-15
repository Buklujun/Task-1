public class Set {
	public String[] mass;
	int over;
	int size;

	Set(int val) {
		mass = new String[val];
		size = 0;
		over = val;
	}

//	public boolean add(String val, function f) {
//		if (over == size) {
//			int new_size = (3 * size / 2) + 1;
//			String[] resize = new String[new_size];
//			for (int i = 0; i < size; i++) {
//				resize[i] = mass[i];
//			}
//			over = new_size;
//			mass = resize;
//		}
//
//		int i = 0;
//		int k = 0;
//		do {
//			k = mass[i];
//			i++;
//		} while ((k != val) && (i < size + 1));
//
//		if (val != mass[i - 1]) {
//			mass[size] = val;
//			size = size + 1;
//			return true;
//		} else
//			return false;
//	}
//
//	public boolean search(int val) {
//		int i = 0;
//		int k = 0;
//		do {
//			k = mass[i];
//			i++;
//		} while ((k != val) && (i < size + 1));
//
//		if (k != val)
//			return false;
//		else
//			return true;
//
//	}
//
//	public boolean remove(int val) {
//			int j = 0;
//			int i = 0;
//		do {
//			j = mass[i];
//			i++; } 
//		while ((j != val) && (i < size + 1));
//
//		if (j != val)
//		return false;
//
//		else {
//				i = 0;
//				boolean k;
//				do{
//					k= (val == mass[i]);
//					i++;}
//					while ((k == false)&(i-1 < size));
//				mass[i-1] = 0;
//
//			return true;
//		}
//
//	}
//
//	public int size() {
//		return this.size;
//	}
//
//	public boolean isEmpty() {
//		if (this.size != 0)
//			return false;
//		else
//			return true;
	}
}
