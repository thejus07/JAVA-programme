import java.util.*;
class basket
{
	public static void main(String args[])
	{
		int n,i,temp,count=0;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[] = new int[n];
		for(i=0;i<n;i++)d
		{
			b[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			Arrays.sort(a);
			Arrays.sort(b);
			if(a[i]!=b[i])
			{
				temp=a[i];
				a[i]=b[i];
				b[i]=temp;
				count++;
				Arrays.sort(a);
			    Arrays.sort(b);
			}
		}
		boolean r=Arrays.equals(a,b);
		if(r)
		{
			System.out.println(count);
		}
		else
		{
			System.out.println("-1");
		}
	}
}