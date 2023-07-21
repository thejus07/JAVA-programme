import java.util.*;
class patt
{
public static void main(String args[])
{
int n=5;
for (int i=1;i<=n;i++)
{
for (int j=i;j>=1;j--)
{
System.out.print(" ");
}
for (int j=1;j<=(i-1);j++)
{
System.out.print("*);
}
System.out.println();
}
for(int i=n-1;i>=1;i--)
{
for(int j=n-i;j>=1;j--)
system.out.print(" ");
}
for(j=1;j<=(i-1);j++)
{
system.out.print("*");
}
system.out.println();
}
}