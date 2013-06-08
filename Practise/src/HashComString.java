import java.util.Hashtable;




public class HashComString {
	public static boolean compare(char StringA[],char StringB[])
	{
		//Hashtable hash= new Hashtable();
		Hashtable<Integer, Boolean> hash1= new Hashtable<Integer, Boolean>();
		
		
		for(int i=0;i<StringA.length;i++)
		{
			int index=StringA[i] - 61;
		//	int value=hash1.get(index);
//			if(Integer.parseInt(hash.get(index).toString())==0)
			if(!hash1.containsKey(index))
			{
				hash1.put(index, false);
				
			}
		}
		
		for(int j=0;j<StringB.length;j++)
		{
			int index=StringB[j] - 61;
		//	int value=hash1.get(index);
			if(!hash1.containsKey(index))
			{
				return false;
			}
		}
		
		 return true;
	}
	
	public static void main(String[] args)
	{
		char[] A={'a','b','d','f','g','i','j','k','m'};
		char[] B={'a','d','f','i'};
		compare(A,B);
		System.out.print(compare(A,B));
	}
}
