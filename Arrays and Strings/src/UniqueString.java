
public class UniqueString {

	public static boolean unique(String str){
		boolean[] asc = new boolean[256];
		for(int i=0;i<str.length();i++){
			int value=str.charAt(i);
			if(asc[value]){
				return false;
			}
			asc[value]=true;
		}
		return true;
	}
	public static void main(String args[]){
		String str="aacde";
		unique(str);
		System.out.print(unique(str));
	}
}
