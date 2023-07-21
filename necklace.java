import java.util.Scanner;
class necklace
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("value of n: ");
int n=sc.nextInt();
System.out.print("value of l: ");
int l=sc.nextInt();
System.out.print("value of r: ");
int r=sc.nextInt();
int count = 0;
for (int i=1;i<=n;i++)
{
for (int j=l;j<=r;j++)
{
count=count+countNecklaces(i, j, l, r);
}
}
System.out.println(":"+count);
}
public static int countNecklaces(int n,int start,int l,int r)
{
if (n==1)
{
if (start>=l && start<=r)
{
return 1;
} 
else
{
return 0;
}
}
int count = 0;
for (int i=start;i<=r;i++)
{
count=count+countNecklaces(n - 1, i, l, r);
}
return count;
}
}




