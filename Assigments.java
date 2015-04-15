public class Assigments {

	public static void main(String[] args) {
		Set test = new Set(10);
		int i = 0;
		for (i = 0; i < 50; i++) {
			String symbols = "qwertyuiopasdfghjklcvbnm";
			StringBuilder randString = new StringBuilder();

			int count = (int) (Math.random() * 9);

			for (int j = 0; j < count; j++) {

				randString.append(symbols.charAt((int) (Math.random() * symbols
						.length())));
			}

			test.add(randString.toString(), new F1());
		}
		System.out.println("add Qwe is " + test.add("Qwe", new F1()));
		// for (i = 0; i < 50; i++){
		// System.out.println(a.mass[i]);
		// }
		System.out.println("add Qwe is " + test.add("Qwe", new F1()));
		System.out.println("add qwe is " + test.add("qwe", new F1()));
		System.out.println("add Wer is " + test.add("Wer", new F1()));
		System.out.println("size a = " + test.size());
		System.out.println("remove Qwe is " + test.remove("Qwe", new F1()));
		// System.out.println(a.mass[9]);
		System.out.println("remove xz is " + test.remove("xz", new F1()));
		System.out.println("search Qwe is " + test.search("Qwe", new F1()));
		System.out.println("remove xz is " + test.search("xz", new F1()));

	}
}
