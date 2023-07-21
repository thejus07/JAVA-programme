import java.util.*;
class patt
{
public static void main(String args[])
{
int n=5,i,j;
for(i=1;i<=n;i++)
{
for(j=i;j>=1;j--)
{
System.out.print(" ");
}
for (j=1;j<=2*i-1;j++)
{
System.out.print("*");
}
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(j=n-i;j>=1;j--)
System.out.print(" ");
}
for(j=1;j<=2*i-1;j++)
{
System.out.print("*");
}
System.out.println();
}
}