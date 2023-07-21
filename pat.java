import java.util.*;
class pat
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int p=(n*2)-1;
		int h=p/2;
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==n-1)
				{
					System.out.print("## ");
				}
				if(i==h)
				{
					if(j!=0 && j!=n-1)
					{
						System.out.print("$");
						if(j==n-2)
						{
							System.out.print(" ");
						}
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}
}