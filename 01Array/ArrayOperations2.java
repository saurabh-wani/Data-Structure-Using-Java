package arrayOperation;

import java.util.Scanner;

public class Array2 {
	
	
	
	public static void display(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	} 
	
	
	
	public static int[] union(int []a,int []b)
	{
			int c[]=new int[a.length+b.length];
			int count=0;
			int k=0;
		
			for(int i=0;i<a.length;i++)
			{
				c[k++]=a[i];
				count++;
			}
			
			for(int i=0;i<b.length;i++)
			{
				boolean flag = true;
				for(int j=0;j<a.length;j++)
				{
					if(b[i]==a[j])
					{
						flag = false;
						break;
					}
				}
				if(flag)
				{
					c[k++]=b[i];
					count++;
				}
			}
			
			int arr[]=new int[count];
			for(int i=0;i<count;i++)
			{
				arr[i] = c[i];
			}
			
			return arr;
	}

	
	public static int [] intersection(int[]a,int[]b)
	{
		int c[]=new int [a.length];
		int k=0;
			
		for(int i=0;i<a.length;i++)
		{	
			boolean flag=false;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag=true;
					c[k++]=a[i];
					//k++;
					break;
				}
			}
				/*if(flag)
				{
					c[i]=a[i];
				}*/
		}
			
		int arr[]=new int[k];
		for(int i=0;i<k;i++)
		{
			arr[i]=c[i];
		}
			
		return arr;
	}
	
		
	public static int[] AminusB(int []a,int[]b)
	{
		int []c=new int[a.length];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			boolean flag = true;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag = false;
					break;
				}
			}
			if(flag)
			{
				c[k++] = a[i];
			}
		}
		
		int []arr=new int[k];
		for(int i=0;i<k;i++)
		{
			arr[i] = c[i];
		}
		
		return arr;
	}
	
	public static int [] unionAll(int[]a,int []b)
	{
		int []c=new int[a.length+b.length];
		
		for(int i=0;i<5;i++)
		{
			c[i]=a[i];
			c[i+5]=b[i];
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		
		int [] a= {10,12,16,15,20};
		int [] b= {10,12,15,22,23};
		int ch;
		Scanner sc=new Scanner (System.in);
		
		
		do
		{	
			System.out.println("\n0.exit");
			System.out.println("1.Union");
			System.out.println("2.Intersection");
			System.out.println("3.A-B");
			System.out.println("4.B-A");
			System.out.println("5.Union All");
			System.out.println("enter your choice");
			ch=sc.nextInt();
			switch(ch)
			{
				case 0: return;
						
				
				case 1:
					System.out.println("Union of elements in arrays:");
					display(union(a,b));
					break;
			
				case 2:
					System.out.println("Intersection of elements in array:");
					display(intersection(a,b));
					break;
					
				case 3:
					System.out.println("A-B:");
					display(AminusB(a,b));
					break;
					
				case 4:
					System.out.println("B-A:");
					display(AminusB(b,a));
					break;
					
				case 5:
					System.out.println("Union All:");
					display(unionAll(a,b));
		
		
		
		
		}
		}while(ch!=0);

	}

}
