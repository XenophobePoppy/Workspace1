import java.util.LinkedList;


public class sumpath {
	public static void main(String[] args){
		int number =3;
		LinkedList<LinkedList<Integer>> result= getSumPaths(number);
		for(LinkedList<Integer> list: result){
			
			for(Integer i: list){
				System.out.print(i+", ");
			}
			System.out.println();
		}
	}
	
	
	public static LinkedList<LinkedList<Integer>> getSumPaths(int number) {

		if (number == 0) {
			LinkedList<LinkedList<Integer>> lls = new LinkedList<LinkedList<Integer>>();
			lls.add(new LinkedList<Integer>());
			return lls;
		}

		LinkedList<LinkedList<Integer>> toreturn = new LinkedList<LinkedList<Integer>>();
		for (int i = 1; i <= number; i++) {
			LinkedList<LinkedList<Integer>> llreturn = getSumPaths(number - i);
			for (LinkedList<Integer> ls : llreturn) {
				ls.add(i);
				toreturn.add(ls);
			}
		}
		return toreturn;
	}

}
