import java.util.*;
class patternt
{
public static void main(String args[])
{
int rows=7;
for (int i=1;i<=rows;i++)
{
for (int j=1;j<i;j++)
{
System.out.print("  ");
}
for (int k=i;k<=rows+i-1;k++)
{
System.out.print(k+" ");
}
System.out.println();
}
}
}