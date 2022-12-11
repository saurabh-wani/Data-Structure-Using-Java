package arrayOperation;

import java.util.Scanner;

public class Array1D 
{
	public static void display(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	public static boolean isSorted(int []a)
	{
		
		boolean flag=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])//decending
			{
				flag=false;
				break;
			}
		}
		//if(flag==false)
		return flag;
	}
	
	public static int findMax(int []a)
	{
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
	
	
	public static int findMin(int []a)
	{
		int min =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];		
		}
		return min;
	}
	
	
	public static int secondHighest(int []a)
	{
		int max=findMax(a);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==max)
				if(i<a.length-1)
					a[i] = a[i+1];
				else
					a[i]=a[i-1];
		}
		max = findMax(a);
		return max;
	}
	
	
	public static int difference(int []a)
	{
		return findMax(a)-findMin(a);
	}
	
	
	public static void reverse(int []a)
	{	int temp;
		for(int i=0,j=a.length-1;i<=a.length/2;i++,j--)
		{	
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	public static void rotateLeft(int []a,int count)
	{
		for(int i=0;i<count;i++)
		{
			int temp=a[0];
			for(int j=1;j<a.length;j++)
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
			
		}
		
		display(a);
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}*/
	}
	
	
	public static void rotateRight(int [] a,int count)
	{
		for(int j=0;j<count;j++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-2;i>=0;i--)
			{
				a[i+1]=a[i];
			
			}
			a[0]=temp;
		}
		
		display(a);
		/*
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}*/
	}
	
	
	public static int[] findElementpositions(int a[],int element)
	{
	
		int j=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
				{
				//pos[j++]=i;
				count++;
				}
		}
		
		int pos[]=new int[count];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
				{
				pos[j++]=i;
				//count++;
				}
		}
		
		return pos;
	}
	
	public static int countOfElements(int a[],int element)
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
				{
				//pos[j++]=i;
				count++;
				}
		}
		return count;
	}
	
	
	
	public static boolean search (int a[],int element)
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(element==a[i])
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	
	public static void main(String[] args) 
	{
	
		int [] a= {19,12,3,12,12};
		int [] b= {1,2,5,8,9};
		int n;
		
		Scanner sc=new Scanner(System.in);
		do 
		{
			System.out.println("\n0.Exit");
			System.out.println("1.Check if Array IsSorted");
			System.out.println("2.Find Max");
			System.out.println("3.Find Secound Max");
			System.out.println("4.Find Difference Max-Min");
			System.out.println("5.Reverse Array");
			System.out.println("6.rotateLeft");
			System.out.println("7.rotateRight");
			System.out.println("8.Find Element's positions in Array:");
			System.out.println("9.Count of Elements");
			System.out.println("10.enter element to search");
			
			System.out.println("Enter Your Choice:");
			n=sc.nextInt();
			
			switch(n)
			{
			case 0:return;
			
			case 1://isSorted..
				System.out.println("Array isSorted:"+isSorted(a));
				break;
				
			case 2:
				System.out.println("Max element in Array is: "+findMax(a));
				break;
				
			case 3:
				System.out.println("second Highest element in Array is: "+secondHighest(a));
				break;
				
			case 4:
				System.out.println("Differnce Max - Min = "+ difference(a));
				break;
				
			case 5:
			    System.out.println(" Reverse of array is");
				reverse(a);
				break;
				
			case 6:
				System.out.println("RotateLeft:");
				System.out.println("Enter No. of times you want to roatate");
				int count=sc.nextInt();
				rotateLeft(a,count);
				break;
				
			case 7:
				System.out.println("RotateRight:");
				System.out.println("Enter No. of times you want to roatate");
				count=sc.nextInt();
				rotateRight(a,count);
				break;
				
			case 8:
				System.out.println("Enter Element to find indexes in Array:");
				System.out.println("Enter Element");
				int element = sc.nextInt();
				System.out.println("Elements's positions :");
				display(findElementpositions(a,element));
				break;
				
			case 9:
				System.out.println("Enter Element to count in Array");
				System.out.println("Enter Element");
				element = sc.nextInt();
				System.out.println("Element's count Array:"+countOfElements(a,element));
				break;
				
			case 10:
				System.out.println("enter the elment you want to search in array ");
				element =sc.nextInt();
				System.out.println("element present :"+search (a,element));
				break;
				
			default:System.out.println("invalid choice ");
		
			
				
				
			}
		
			
			
		}while(n!=0);

	}

}
