import java.util.*;
public class divide
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int n=s.nextInt();
for(int i=1;i<n+1;i++)
{
if(n%i==0)
{
System.out.println(i);
}
}
}
}
