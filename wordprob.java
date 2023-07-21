import java.util.*;
class wordprob
{
 public static void main(String args[])
{
  int count=0;
 Scanner sc=new Scanner(System.in);

  String str=sc.nextLine();
  int size=str.length();
char arr[]=new char[size];
  char str1 = sc.next().charAt(0);
for(int i=0;i<size;i++)
{ 
  arr[i]=str.charAt(i);
  if(arr[i]==str1)
  {
    count++;
  }
}
System.out.println(count);
}
}