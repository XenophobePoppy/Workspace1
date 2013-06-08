
public class TestQS {
	public static void main(String[] args)
	{
		int list[]={1,4,54,32,67,14,26,89,57};
		QuickSort qs=new QuickSort();
		
		qs.quicksort(list, 0, list.length-1);

		for(int i=0;i<list.length;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}
}
