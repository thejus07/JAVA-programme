import java.util.*;
class matpat2
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
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j+i==1||i+j==3)
				{
					System.out.print("*"+" ");
				}
				else if(i==1&&j==1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
			System.out.print(a[i][j]+5+" ");
			}
			System.out.print("\n");
		}
	}
}
