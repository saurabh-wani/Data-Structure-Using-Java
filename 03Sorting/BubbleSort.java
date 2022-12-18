package BubbleSort;

public class Test 
{

	public static void bubbleSort(int arr[])
	{
		int temp;
		boolean flag;
		for(int i=0;i<arr.length-1;i++)
		{
			
			flag=false;
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			
			
			if(flag==false)
			{
				System.out.println("\nMin Passes Required: " + i);
				break;
			}
			System.out.println("\nPASS: " + (i+1));
			display(arr);
		}

		
		//return arr;
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
		
		
		bubbleSort(arr);
		
		System.out.println("\nAfter Sorting:");
		display(arr);
	}

}
