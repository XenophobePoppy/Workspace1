
public class CompareString {

	public static boolean compare(char[] StringA,char[] StringB)
	{
		for(int i=0;i<StringB.length;i++)
		{
			int j;
			for(j=0;j<StringA.length;j++)
			{
				if(StringA[j]==StringB[i])
				{
					break;
				}
				
			}
			if(j==StringA.length)
			{
				return false;
			}
			
		}
			return true;
	}
	public static void main(String[] arg)
	{
		char[] A={'a','b','c','d','e','f','g','h','i','j'};
		char[] B={'a','k','c'};
		compare(A,B);
		System.out.println(compare(A,B));
	}
}
