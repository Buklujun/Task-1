public class Assigments {

	public static void main(String[] args) {
		Set a = new Set(10);
		int i = 0;
		for (i = 0; i < 50; i++) {
			String symbols = "qwertyuiopasdfghjklcvbnm";
			StringBuilder randString = new StringBuilder();

			int count = (int) (Math.random() * 9);

			for (int j = 0; j < count; j++) {

				randString.append(symbols.charAt((int) (Math.random() * symbols
						.length())));
			}

			a.add(randString.toString(), new f1());
		}
		a.add("Qwe", new f1());
		// for (i = 0; i < 50; i++){
		// System.out.println(a.mass[i]);
		// }
		System.out.println("add Qwe is " + a.add("Qwe", new f1()));
		System.out.println("add qwe is " + a.add("qwe", new f1()));
		a.add("Wer", new f1());
		System.out.println("add qwe is " + a.add("qwe", new f1()));
		System.out.println("add wer is " + a.add("wer", new f2()) + " "
				+ "with f2");
		System.out.println("size a = " + a.size());
		System.out.println("remove Qwe is " + a.remove("Qwe", new f1()));
		// System.out.println(a.mass[9]);
		System.out.println("remove xz is " + a.remove("xz", new f1()));
		System.out.println("search Qwe is " + a.search("Qwe", new f1()));
		System.out.println("remove xz is " + a.search("xz", new f1()));

	}
}
