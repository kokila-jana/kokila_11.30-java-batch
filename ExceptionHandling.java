package morninng;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) //throws InterruptedException 
	{
//		for(int i=1;i<=10;i++)
//		{
//			System.out.println(i);
//			Thread.sleep(500);
//		}
		
//		System.out.println("welcome");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();//InputMismatchException
//		int c=a/b;//ArithmeticException
//		System.out.println(c);
		
		
//		int a[]= {12,63,9,5,93,3};
//		System.out.println(a[6]);//ArrayIndexOutOfBoundsException
		
//		String s="JAva";
//		System.out.println(s.charAt(4));
//		//StringIndexOutOfBoundsException
		
//		Scanner sc=new Scanner(System.in);
//		try
//		{
//		int a=sc.nextInt();
//		int b=sc.nextInt();//InputMismatchException
//		int c=a/b;//ArithmeticException
//		System.out.println(c);
//		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("a divided by zero");
//		}
//		catch(InputMismatchException e1)
//		{
//			System.out.println("Input format is changed..");
//		}
//		finally
//		{
//		System.out.println("Java");
//		}
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible for voting...");
		}
		else
		{
			throw new ArithmeticException("not eligible");
//			System.out.println("not eligible");
		}
		
	}
/*
 * Error
 * 
 * 3 types
 * 1.compile time error
 * 2.run time error
 * 3.Logical error
 */
}
