package SelectionSort;

public class Test 
{
	public static int[] selectionSort(int arr[])
	{
		int min,index;
		
		for(int i=0;i<arr.length-1;i++)
		{
			min=arr[i];
			index=i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				
				}
			}
			//can not use flag to show min number of iteration required
			
			arr[index]=arr[i];
			arr[i]=min;
			

			System.out.println("\nPASS: " + (i+1));
			display(arr);
		}
		
		return arr;
	}
	
	
	public static void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) 
	{
		int []arr= {20,40,10,5,15,30,50,80,90,35};
		
		int res[]=new int[arr.length];
		
		System.out.println("Before Sorting:");
		display(arr);
		
		
		res = selectionSort(arr);
		
		System.out.println("\nAfter Sorting:");
		display(res);

	}

}
