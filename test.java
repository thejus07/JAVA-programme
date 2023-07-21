import java.util.Scanner;
class Test
 {   
 public static void main(String args[] ) 
 {
 Scanner sc=new Scanner(System.in);
 String str=sc.next();
 char arr[]=str.toCharArray();
 boolean p=false;
 int counta=0;
 int countb=0;
 for(int i=0;i<str.length()-1;i++)
 {
 if((arr[i]=='1')&&(arr[i+1]=='1'))
 counta++;
 else if((arr[i]=='0')&&(arr[i+1]=='0'))
 countb++;
 else
 {
 counta=0;
 countb=0;
 }
 if((counta>=5)||(countb>=5))
 {
 p=true;
 break;
 }
 }
 if(p)
 System.out.println("Sorry, sorry!");
 else
 System.out.println("Good luck!" );
 }
}