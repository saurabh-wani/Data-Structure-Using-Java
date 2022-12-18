package Question03;

import java.util.Scanner;

public class Test 
{
	public static int binarySearchIterations(int arr[],int key)
	{
		int low=0,high=arr.length-1;
		int mid;
		int count=0;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			count++;
			if (arr[mid]==key)
			{
				System.out.println("Element Found");
				break;
			}
			else if(arr[mid]>key)
			{
				high=mid-1;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
		}
		
		return count;
	}

	public static void main(String[] args)
	{
		int []arr= {10,20,25,30,40,50,55,60,70,80};
		int key;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Element to search:");
		key = sc.nextInt();
		
		int count=binarySearchIterations(arr,key);
		
		System.out.println("Number of Iterations Required: "+ count);
		

	}

}
