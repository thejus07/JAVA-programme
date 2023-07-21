import java.util.Scanner;
class patterns
{
public static void main(String args[]) 
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter a word: ");
String s=scan.nextLine();
int n= s.length();
for (int i=0;i<n;i++)
{
for (int j=0;j<=n/2; j++) 
{
if(i==n/2)
{
system.out.println(s);
}
else
{
if(j==n/2)
{
System.out.println(s.charAt(i));
else
{
System.out.print(" ");
}
}
system.out.println();
}
}
}
