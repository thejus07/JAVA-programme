import java.util.*;
class wordasses
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of strings: ");
int n=sc.nextInt();
String maxWord ="";
for(int i=0;i<n;i++)
{
String word =sc.next();
if(word.length()%2 == 1 && word.length()>maxWord.length()) 
{
maxWord = word;
}
}
if(maxWord.isEmpty()) 
{
System.out.println("Better luck next time");
} 
else 
{
System.out.println(":"+maxWord);
}
}
}
