imp.ort java.util.*;
class patternn
{
public static void main(String args[])
{
int i,j,k;
for(i=1;i<11;i++)
{
for(j=1;j<=2;j++)
{
System.out.println("#");
}
for(k=j;k<=11;k++)
{
if(i==0 ||j==7)
{
System.out.println("**");
}
else
{
System.out.print(" ");
}
}
for(j=0;j<2;j++)
{
System.out.println("$");
}
}
System.out.print("\n");
}
}