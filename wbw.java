import java.util.*;
class wbw
{
public static void main(String args[])
 {
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
sc.nextLine();
for (int i=0;i<t;i++) 
{
String str=sc.nextLine();
int bCount=0;
for (int j=0;j<str.length(); j++)
 {
if (str.charAt(j)=='B')
 {
bCount++;
}
}
System.out.println(bCount * 2);
}
}
}