package morninng;

import java.util.Scanner;

//public class Functions
//{
//static int add(int a,int b)
//{
//	int c=a+b;
//	return c;
//}
//	
//	public static void main(String[] args) 
//	{
//		int x=add(12,45);
//		System.out.println(x);
//		System.out.println(add(45,69));
//	}
//
//}

//public class Functions
//{
//static double withdrawl(double amount)
//{
//	double balance=5000;
//	double res=0;
//	if(amount<balance)
//	{
//	 res=balance-amount;
//	}
//	else
//	{
//		System.out.println("insufficent balance");
//		return balance;
//	}
//	return res;
//}
//	
//	public static void main(String[] args) 
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your amount...");
//		double d=sc.nextDouble();
//		System.out.println(withdrawl(d));
//	}
//
//}


public class Functions
{
static int linearSearch()
{
	int a[]= {12,5,28,58,78,84,8};
	int key=84;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==key)
		{
			return i;
		}
	}
	return -1;
}
	
	public static void main(String[] args) 
	{
		int x=linearSearch();
		if(x==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("element found "+x+" position");
		}
	}

}
