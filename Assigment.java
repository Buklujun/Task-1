public interface Function<F, T>{
	T apply (F from, F from1);

}
public class Assigment {
	public static void main (String[] args){
		Set a = new Set(10);
		Set b = new Set(10);
		String k = new String();
		String l = new String();
		l = "ab";
		k = "bc";
		int i=0;
		Function<boolean, String> compare = new Function <boolean, String>(){
			@Override public boolean apply(String from, String from1){
				return from == from1;
				
			}
		}
		
		}

	}		
}
