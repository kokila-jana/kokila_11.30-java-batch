package morninng;

import java.util.Arrays;
import java.util.Scanner;

public class StringConcepts {

	public static void main(String[] args)
	{
//		String s="Java";
//		String ss=new String("Java");
//		String s1="Java";
//		System.out.println(s==ss);//f
//		System.out.println(s==s1);//f
//		System.out.println(s.equals(ss));//t
		
//		String s="Hello";
//		String s1=new String("Java");
//		/*
//		 *  H   e   l   l  o
//		 *  0   1   2   3  4
//		 *  
//		 *  J   a   v   a
//		 *  0   1   2   3
//		 */
//		System.out.println(s);
//		System.out.println(s.charAt(4));//1
//		System.out.println(s.codePointAt(1));//2
//		System.out.println(s1.codePointBefore(2));//3
//		System.out.println(s1.compareTo("JavA"));//4
//		/*
//		 * Hello-->H-->72
//		 * Java--->J-->74(-)-->-2
//		 * 
//		 * Java-->a-->97
//		 * JavA-->A-->65(-)-->32		 * 
//		 */
//		System.out.println(s.compareToIgnoreCase("HeLLo"));
//		System.out.println(s.concat(s1));
//		System.out.println(s.contains("ll"));
//		System.out.println(s.endsWith("lo"));
//		System.out.println(s.equals("Hello"));
//		System.out.println(s.equalsIgnoreCase("HELLO"));
//		System.out.println(s.indent(5));
//		System.out.println(s.indexOf('l'));
//		System.out.println(s.lastIndexOf('l'));
//		System.out.println(s.length());
//		String s2="";
//		System.out.println(s2.isBlank());
//		System.out.println(s2.isEmpty());
//		System.out.println(s.repeat(2));
//		System.out.println(s1.replace('a','A'));
//		System.out.println(s.startsWith("He"));
//		String s3="       Python     ";
//		System.out.println(s3.strip());
//		System.out.println(s3.stripLeading());
//		System.out.println(s3.stripTrailing());
//		System.out.println(s.substring(2));
//		System.out.println(s.substring(0, 3));
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
//		System.out.println(s3.trim());
//		
//		char a[]=s.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
//		for(char i:a)
//		{
//			System.out.println(i);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		String s=sc.nextLine();
//		String s1="";
////		for(int i=0;i<s.length();i++)
////		{
////			s1=s.charAt(i)+s1;
////		}
////		System.out.println(s1);
//		
//		char c[]=s.toCharArray();
//		for(int i=0;i<c.length;i++)
//		{
//			s1=c[i]+s1;
//		}
//		System.out.println(s1);
//		/*
//		 * J  a  v  a
//		 * 0  1  2  3
//		 * 
//		 * 1)s1=J+""-->s1=J
//		 * 2)s1=a+J-->s1=aJ
//		 * 3)s1=v+aJ-->s1=vaJ
//		 * 4)s1=a+vaJ-->s1=avaJ
//		 * 
//		 */
//		if(s.equals(s1))
//		{
//			System.out.println("Palindrome");
//		}
//		else
//		{
//			System.out.println("not Palindrome");
//		}
		
		/*
		 * Anagram
		 * s="race"
		 * s1="care"
		 */
		
//		int a[]= {12,69,356,9,659,6};
//		Arrays.sort(a);
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
		
//		String s="race";
//		char a[]=s.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]>a[j])
//				{
//					char temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
////		for(char i:a)
////		{
////			System.out.println(i);
////		}
//		String ss=new String(a);
//		System.out.println(ss);
		
//		String s="race",s1="care";
//		char a[]=s.toCharArray();
//		char b[]=s1.toCharArray();
//		Arrays.sort(a);
//		Arrays.sort(b);
//		if(Arrays.equals(a, b))
//		{
//			System.out.println("Anagram");
//		}
//		else
//		{
//			System.out.println("Not Anagram");
//		}
		
//		StringBuffer s=new StringBuffer("Hello");
//		System.out.println(s);
//		System.out.println(s.capacity());
//		s.ensureCapacity(25);
//		/*
//		 * 21*2-->42+2-->44
//		 */
//		/*
//		 *   H  e  l  l  o
//		 *   0  1  2  3  4
//		 */
//		System.out.println(s.capacity());
//		s.append(" Java");
//		/*
//		 *   H  e  l  l  o     J  a  v  a
//		 *   0  1  2  3  4  5  6  7  8  9
//		 */
//		System.out.println(s);
//		s.deleteCharAt(5);
//		/*
//		 *   H  e  l  l  o  J  a  v  a
//		 *   0  1  2  3  4  5  6  7  8  
//		 */
//		System.out.println(s);
//		s.replace(5, 9, " CPP");
//		/*
//		 *   H  e  l  l  o     C  P  P  
//		 *   0  1  2  3  4  5  6  7  8 
//		 */
//		System.out.println(s);
//		s.insert(5, '@');
//		/*
//		 *   H  e  l  l  o  @     C  P  P  
//		 *   0  1  2  3  4  5  6  7  8  9
//		 */
//		System.out.println(s);
//		s.setCharAt(6, '$');
//		/*
//		 *   H  e  l  l  o  @  $  C  P  P  
//		 *   0  1  2  3  4  5  6  7  8  9
//		 */
//		System.out.println(s);
//		s.delete(5, 10);
//		/*
//		 *   H  e  l  l  o    
//		 *   0  1  2  3  4  
//		 */
//		System.out.println(s);
//		s.setLength(10);
//		/*
//		 *   H  e  l  l  o    
//		 *   0  1  2  3  4  
//		 */
//		System.out.println(s);
//		s.reverse();
//		/*
//		 *   H  e  l  l  o    
//		 *   0  1  2  3  4  
//		 */
//		System.out.println(s);
		
		
		String s="Java";
		System.out.println(s.hashCode());
		
		
	}

}
