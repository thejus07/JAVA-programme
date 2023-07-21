import java.util.*;
class perfectsquare
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = sc.nextInt();
int s=0;
for(int i=1;i<=num/2;i++)
{
if(i*i==num)
{
s=i;
}
}
if(s*s==num) 
System.out.println("perfect square");
else
System.out.println("not a perfect square");
}
}
