import java.util.*;
class matrixx
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					temp=a[i][j];
					a[i][j]=a[1][1];
					a[1][1]=temp;
				}
			
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(i+j==1)
			{
				System.out.print("-"+a[i][j]);
			}
				else
				System.out.print(a[i][j]);
			}
			System.out.println("\n");
		}
	}
}