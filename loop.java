package morninng;

import java.util.Scanner;

public class controllStatements {

	public static void main(String[] args) 
	{
		/*
		 * if(condition)
		 * {
		 * 		if(condition)
		 *      {
		 *      
		 *      }
		 *      else
		 *      {
		 *      
		 *      }
		 * }
		 * else
		 * {
		 * 
		 * }
		 * 
		 */
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		if(a!=0)
//		{
//			if(a>0)
//			{
//				System.out.println("positive number");
//			}
//			else
//			{
//				System.out.println("negative number");
//			}
//		}
//		else
//		{
//			System.out.println("Zero");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter user name");
//		String s=sc.nextLine();
//		if(s.equals("Java"))
//		{
//			System.out.println("Enter the password");
//			String s1=sc.nextLine();
//			if(s1.equals("ja123"))
//			{
//				System.out.println("Login success");
//			}
//			else
//			{
//				System.out.println("incorrect password");
//			}
//		}
//		else
//		{
//			System.out.println("incorrect user name");
//		}
		
		/*
		 * loop
		 * 2 types
		 * 1.Entry checked loop
		 *      2 types
		 *      1.for loop
		 *      2.while loop
		 * 2.exit checked loop
		 * 1.do while
		 */
		/*
		 * for loop
		 * syntax
		 * for(initialization;condition;inc/dec)
		 * {
		 * 		//block
		 * }
		 * 
		 * Running process
		 * 1.initialization(start)
		 * 2.condition(stop)
		 * 3.block
		 * 4.inc/dec
		 * 
		 */
//		for(int i=1;i<11;i++)
//		{
//			System.out.println(i);
//		}
		
		/*
		 *    1      2       3      4
		 *    i=1   1<11     1     i=1+1=2
		 *    i=2   2<11     2     i=2+1=3
		 *    .
		 *    .
		 *    i=10  10<11    10    i=10+1=11
		 *    i=11  11<11(false)
		 *    
		 */
		
//		for(int i=10;i>=1;i--)
//		{
//			System.out.println(i);
//		}
		
//		int i=1;
//		for(;i<11;)
//		{
//			System.out.println(i);
//			i++;
//		}
		
//		int sum=0;
//		for(int i=1;i<11;i++)
//		{
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		int multi=1;
//		for(int i=1;i<=5;i++)
//		{
//			multi*=i;
//		}
//		System.out.println(multi);
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		for(int i=1;i<=a;i++)
//		{
//			if(a%i==0)
//			{
//				System.out.println(i);
//			}
//		}
		
		
//		for(int i=1;i<5;i++)//row
//		{
//			for(int j=1;j<=i;j++)//column
//			{
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		/*
		 * 1)   i=1  1<5
		 *      j=1  1<=1-->* 
		 *      j=2  2<=1(false)
		 *      
		 * 2)   i=2  2<5
		 *      j=1  1<=2-->* * 
		 *      j=2  2<=2-->
		 *      j=3  3<=2(false)
		 * 
		 * 3)   i=3  3<5
		 *      j=1  1<=3-->* * * 
		 *      j=2  2<=3-->
		 *      j=3  3<=3-->
		 *      j=4  4<=3(false)
		 *      
		 * 4)  i=4  4<5
		 *     j=1  1<=4-->* * * *
		 *     j=2  2<=4-->
		 *     j=3  3<=4-->
		 *     j=4  4<=4-->
		 *     j=5  5<=4(false)
		 * 5)i=5  5<5(false)
		 * 
		 */
		
//		int a=65;
//		for(int i=1;i<8;i++)//row
//		{
//			for(int j=1;j<=i;j++)//column
//			{
//				System.out.print((char)a+" ");
//				a++;
//				if(a>90)
//				{
//					a=65;
//				}
//			}
//			System.out.println();
//		}
		
		/*
		 * while loop-->infinity loop
		 * initialization-->1
		 * while(condition)-->2
		 * {
		 * 		//block-->3
		 * 	//   inc/dec-->4
		 * }
		 * 
		 * 
		 *  initialization-->1
		 * while(condition)-->2
		 * {
		 * 		inc/dec-->3
		 * 		//block-->4   
		 * }
		 */
		
//		int a=1;
//		while(a<=10)
//		{
//			System.out.println(a);
//			a++;
//		}
		
//		int a=10;
//		while(a>=1)
//		{
//			System.out.println(a);
//			a--;
//		}
		
//		int a=1;
//		while(a<=10)
//		{
//			a++;
//			System.out.println(a);
//		}
		
		//To reverse a number
		//123-->321
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b*10+c;
//			a=a/10;
//		}
//		System.out.println(b);
		/*
		 * a=852
		 * b=0
		 * 1)  852>0
		 *     c=852%10-->c=2
		 *     b=0*10+2-->b=2
		 *     a=852/10-->a=85
		 * 2) 85>0
		 *    c=85%10-->c=5
		 *    b=2*10+5-->b=25
		 *    a=85/10-->a=8
		 * 
		 * 3)8>0
		 *    c=8%10-->c=8
		 *    b=25*10+8-->b=258
		 *    a=8/10-->a=0
		 * 4) 0>0(false)  
		 */
		
		/*
		 * Given number is Palindrome or not
		 * 121--->121
		 */
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int x=a;
//		int b=0;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b*10+c;
//			a=a/10;
//		}
//		System.out.println(b);
//		if(x==b)
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("Not Palindrome");
//		}
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		while(a>0)
//		{
//			b++;
//			a=a/10;
//		}
//		System.out.println(b);
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b+c;
//			a=a/10;
//		}
//		System.out.println(b);
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=1;
//		while(a>0)
//		{
//			int c=a%10;
//			b=b*c;
//			a=a/10;
//		}
//		System.out.println(b);
		
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=0;
//		for(int i=1;i<=a;i++)
//		{
//			if(a%i==0)
//			{
//				b++;
//			}
//		}
//		System.out.println(b);
//		if(b==2)
//		{
//			System.out.println("Prime number");
//		}
//		else
//		{
//			System.out.println("not Prime number..");
//		}
		
		/*
		 * Armstrong number
		 * 153
		 * 153-->3
		 * 3^3 +  5^3 +1^3-->27+125+1-->153
		 */
		
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int x=a;
//		int temp=a;
//		int count=0;
//		while(a>0)
//		{
//			count++;
//			a=a/10;
//		}
//		System.out.println(count);
//		int res=0;
//		while(x>0)
//		{
//			int c=x%10;
//			res=(int) (res+Math.pow(c, count));
//			x=x/10;
//		}
//		System.out.println(res);
//		if(temp==res)
//		{
//			System.out.println("Armstrong number");
//		}
//		else
//		{
//			System.out.println("Not Armstrong number..");
//		}
//		
		
		/*
		 * do-while loop
		 * initialization 
		 * do
		 * {
		 * 		//block
		 * 		//inc/dec
		 * }
		 * while(condition);
		 * 
		 */
//		int a=1;
//		do
//		{
//			System.out.println(a);
//			a++;
//		}
//		while(a>=10);
		
		int a=1;
		while(true)
		{
			System.out.println(a);
			a++;
		}
		
		
		
		
	}

}
