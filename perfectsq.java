import java.util.*;
class perfectsq
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER ARRAY : ");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i*i==a[j])
			{
				if(a[j]==1)
				{
					continue;
				}
				else
				System.out.print(a[j]+" ");	
				count++;
			}
			}
		}
		System.out.println(count);
	}		
}