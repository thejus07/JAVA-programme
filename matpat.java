import java.util.*;
class matpat
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
				if(i==1 && j==1)
                        {

                        System.out.print(a[i][j]);
}
else
{
System.out.print("*");
}
}
System.out.print("\n");
}
}
}