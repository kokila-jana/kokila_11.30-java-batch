Scanner sc=new Scanner(System.in);
//		while(true)
//		{
//			System.out.println("1.Login\n2.booking\n3.View booking\n4.exit");
//			System.out.println("Enter your choice..");
//			int a=sc.nextInt();
//			if(a==1)
//			{
//				System.out.println("Login success");
//			}
//			else if(a==2)
//			{
//				System.out.println("Booking success");
//			}
//			else if(a==3)
//			{
//				System.out.println("viewed...");
//			}
//			else if(a==4)
//			{
//				System.out.println("Thanks for visiting");
//				break;
//			}
//			else
//			{
//				System.out.println("invalid choice");
//			}
//		}
		
		/*
		 * switch-case(else if)
		 * 4 keywords
		 * 1.switch
		 * 2.case
		 * 3.break
		 * 4.default
		 */
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter 2 numbers...");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		System.out.println("Enter you operator...");
//		char c=sc.next().charAt(0);
//		switch(c)
//		{
//		case '+':System.out.println(a+b);break;
//		case '-':System.out.println(a-b);break;
//		case '*':System.out.println(a*b);break;
//		case '/':System.out.println(a/b);break;
//		default:
//			System.out.println("Invalid operator");
//		}
		
//		int a=10;
//		a=45;
//		a=78;
//		a=96;
//		System.out.println(a);
		
//		int a[]= {10,45,78,96};
//		System.out.println(a.length);
//		System.out.println(a[2]);
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		/*.
		 * 
		 * a-->   10    45    78    96
		 *       a[0]    1     2     3
		 *    
		 * a.length=4
		 * index=length-1-->4-1=>3
		 * 
		 * 
		 * Java array syntax
		 * data-type variable[]=new data-type[size]; 
		 */
//		int a[]=new int[5];
//		a[0]=12;
//		a[1]=45;
//		a[2]=78;
//		a[3]=78;
//		a[4]=96;
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size...");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("Enter array elements...");
//		for(int i=0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println("The array elements...");
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i+1;j<n;j++)
//			{
//				if(a[i]>a[j])
//				{
//					int temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		System.out.println("The Ascending array elements...");
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
//		
		
//		int min=a[0];
//		for(int i=1;i<n;i++)
//		{
//			if(min>a[i])
//			{
//				min=a[i];
//			}
//		}
//		System.out.println("the min value is "+min);
//		
//		int max=a[0];
//		for(int i=1;i<n;i++)
//		{
//			if(max<a[i])
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("the min value is "+max);
		/*
		 * min=45
		 * 1)i=1  1<5 
		 *   if(45>52)(false)
		 * 2)i=2  2<5
		 *    if(45>61)
		 * 3)i=3  3<5
		 *    if(45>22)
		 *    {
		 *    min=22
		 *    }
		 * 4)i=4  4<5
		 *   if(22>55)
		 * 5)i=5  5<5
		 */
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter array size...");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		System.out.println("Enter array elements...");
//		for(int i=0;i<n;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		System.out.println("The array elements...");
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(a[i]);
//		}
//		System.out.println("enter element you want to search... ");
//		int key=sc.nextInt();
//		for(int i=0;i<n;i++)
//		{
//			if(a[i]==key)
//			{
//				System.out.println("element found "+i+" position");
//			}
//		}
		
		/*    0  1  2
		 * 0  1  2  3
		 * 1  4  5  6
		 * 2  7  8  9
		 */
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		System.out.println(a[1][1]);
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		/*    0    1    2
		 * 0  12   45   78
		 * 
		 * 1  96   63   99
		 */
		
//		int a[][]=new int[2][3];
//		a[0][0]=12;
//		a[0][1]=45;
//		a[0][2]=78;
//		a[1][0]=96;
//		a[1][1]=63;
//		a[1][2]=99;
//		for(int i=0;i<2;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter row and column size");
//		int row=sc.nextInt();
//		int col=sc.nextInt();
//		int a[][]=new int[row][col];
//		int b[][]=new int[row][col];
//		System.out.println("enter First  array values");
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				a[i][j]=sc.nextInt();
//			}
//		}
//		System.out.println("enter second  array values");
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				b[i][j]=sc.nextInt();
//			}
//		}
//		
//		System.out.println("The first array values");
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("The second array values");
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		int c[][]=new int[row][col];
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				c[i][j]=a[i][j]+b[i][j];
//			}
//		}
//		System.out.println("The result array values");
//		for(int i=0;i<row;i++)
//		{
//			for(int j=0;j<col;j++)
//			{
//				System.out.print(c[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		/*
		 * syntax for user-defined function
		 * 
		 *  public static return-type functionName(arguments)
		 *  {
		 *  	//block
		 *  }
		 */
