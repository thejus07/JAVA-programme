import java.util.*;
class evensum
{
evensum()
{
int i,j,s,k=0,l;
int n[]={10,20,30,40,50,60,70};
int m=7;
for(i=0;i<m;i++)
{
s=n[i]/10;
if(s%2==0)
{
l=s*10;
k=k+l;
}
}
System.out.println(k);
}
public static void main(String arg[])
{
evensum obj=new evensum();
}
}