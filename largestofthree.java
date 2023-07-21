import java.util.*;
class largestofthree
{
	public static void main(String arg[])
	{
		int m1,m2,m3;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value m1 ");
		m1=sc.nextInt();
		System.out.println("enter the value m2 ");
		m2=sc.nextInt();
		System.out.println("enter the value m3 ");
		m3=sc.nextInt();
		if(m1>m2&&m1>m3)
		{
			System.out.println("The maximun number is "+m1);
		}
		else if(m2>m1&&m2>m3)
		{
			System.out.println("The maximun number is "+m2);
		}
		else
		{
			System.out.println("The maximun number is "+m3);
		}
	}
}
