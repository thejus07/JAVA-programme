class dpat
{
public static void main(String arg[])
{
int n,i,j,k;
n=7;
for(i=1;i<=n;i++)
{
for(k=i;k<=n;k++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
for(i=n-1;i>0;i--)
{
for(k=i;k<=n;k++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print("* ");
}

System.out.println();
}
}
}