
//public class Functions
//{
//	static void isBiggest(int a,int b,int c)
//	{
//		if(a>b && a>c)
//		{
//			System.out.println("a is big");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("b is big");
//		}
//		else if(c>a && c>b)
//		{
//			System.out.println("c is big");
//		}
//		else
//		{
//			System.out.println("All are equal");
//		}
//	}
//	public static void main(String[] args) 
//	{
//		isBiggest(12,6,9);
//		isBiggest(1,6,9);
//		isBiggest(1,6,5);
//		isBiggest(12,12,12);
//	}
//
//}

//public class Functions
//{
//	static void demo()
//	{
//		int a=10;
//		a+=5;
//		System.out.println(a);
//	}
//	public static void main(String[] args) 
//	{
//		demo();
//		demo();
//	}
//
//}

//public class Functions
//{
//	static int a=10;
//	static void demo()
//	{
//		a+=5;
//		System.out.println(a);
//	}
//	public static void main(String[] args) 
//	{
//		demo();
//		demo();
//	}
//
//}
/*
 * Types of variable
 * 1.local variable
 * 2.Global variable
 * 3.static variable
 */

public class Functions
{
	static int fact(int a)
	{
		if(a==0 || a==1)
		{
			return 1;
		}
		else
		{
			return a*fact(a-1);
		}
	}
	/*
	 * a=5
	 * 5*fact(4)
	 * 5*4*fact(3)
	 * 5*4*3*fact(2)
	 * 5*4*3*2*fact(1)
	 * 5*4*3*2*1=>120
	 */
	public static void main(String[] args) 
	{
		System.out.println(fact(5));
	}

}
