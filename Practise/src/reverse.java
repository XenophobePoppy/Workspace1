
public class reverse 
{
	
	public static char[] invert(char[] a,int start, int end)
	{
		while(start<end)
		{
			char temp;
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		 return a;
	}
	
	public static void left(char[] a,int n, int k)
	{
		a=invert(a,0,k-1);
		a=invert(a,k,n-1);
		a=invert(a,0,n-1);
	}
	
	public static void main(String[] arg)
	{
		char[] a={'a','b','c','d','e'};
		left(a,a.length,2);
		//a=invert(a,0,a.length-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
