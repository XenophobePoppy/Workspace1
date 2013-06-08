
public class getNthFibonacci {
	public static int fibonacci(int n){
		if(n==0||n==1)
			return n;
		int first=0, second=1, current=0 ;
		for(int i=0;i<n;i++){
			current=first+second;
			first=second;
			second=current;
		}
		return first;
	}
	public static void main(String[] args){
		System.out.println(fibonacci(8));
	}
}
