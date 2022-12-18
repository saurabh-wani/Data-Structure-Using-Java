package Question01;

import java.util.Scanner;

public class Test 
{
	public static int searchEle(int arr[],int key)
	{
		int position=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			if(key == arr[i])
			{
				position = i;
				break;
			}
		}
		
		return position;
	}
	
	
	public static void main(String[] args) 
	{
		int []arr=new int[10];
		int key,result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 10 Array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter element for searching:");
		
		key = sc.nextInt();
		
		result=searchEle(arr,key);
		
		if(result != -1)
			System.out.println("Element is present on index: " + result );
		else
			System.out.println("Element not found in array");
		
		sc.close();
	}
	


}
