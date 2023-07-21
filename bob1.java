import java.util.*;
class bob1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<=t;i++)
		{
			String a=s.nextLine();
			int size=a.length();
			int count=0;
			int count1=0;
			char b='B';
			int k;
			int j;
			for(k=0;k<size;k++)
			{
				char p=a.charAt(k);
				if(p==b)
				{
					count1++;
					int l=k;
					for(j=l-2;j<=l+2;j++)
					{
						if(j>=0 && j<size)
						{
							char o=a.charAt(j);
							if(o!=b)
							{
								count++;
							}
						}
					}
				}
			}
			int sum=0;
			if(size==count)
			{
				sum=count-count1;
			}
			else
			{
				sum=count;
			}
			System.out.println(sum);
		}
	}
}