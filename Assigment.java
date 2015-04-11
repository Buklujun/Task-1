
public class Assigment {
	public static void main (String[] args){
		Set a = new Set(10);
		Set b = new Set(10);
		int i=0;

		for (i=0;i<25;i++){
			a.add(i);
			b.add(i+1);
		}
		for (i=0;i<25;i++){
			System.out.print(a.mass[i] + " ");
		}
		System.out.print("\n");
		for (i=0;i<25;i++){
			System.out.print(b.mass[i] + " ");
		}
		System.out.print("\n");
		System.out.println("add 16 to a is " + a.add(16));
		System.out.println("a have 12 is " + a.search(12));
		System.out.println("a is empty is " + a.isEmpty());
		System.out.println("sizeof a = " + a.size());
		System.out.println("add 1 to b is " + b.add(1));
		System.out.println("remove 2 from a is " + a.remove(2));
		System.out.println("remove 35 from a is " + a.remove(35));
		System.out.print("\n");
	for (i=0;i<25;i++){
		System.out.print(a.mass[i] + " ");
	}
}
}
