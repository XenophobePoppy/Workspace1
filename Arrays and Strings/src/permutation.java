import java.util.Arrays;


public class permutation {
	public static String sort(String s){
		char[] a=s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	public static boolean permutate(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		return sort(s).equals(sort(t));
	}
	
	public static void main(String args[]){
		String s="smile";
		String t="mile";
		System.out.print(permutate(s,t));
	}
}
