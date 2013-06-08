
public class QuickSort {
	
	int list[];
	public static int middle(int[] list,int low,int high)
	{
		int tmp=list[low];
		while(low<high)
		{
			while(low<high && list[high]>tmp)
			{
				high--;
			}
			list[low]=list[high];
			while(low<high && list[low]<tmp)
			{
				low++;
			}
			list[high]=list[low];
		}
		list[low]=tmp;
		return low;
	}
	
	
	public void quicksort(int list[],int low,int high)
	{
		if(low<high)
		{
			int middle=middle(list,low,high);
			quicksort(list,low,middle-1);
			quicksort(list,middle+1,high);
		}
	}
	
}
