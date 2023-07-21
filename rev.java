import java.util.*;
class rev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a sentence: ");
String sentence=sc.nextLine();
String[] words=sentence.split(" ");
String revsent=" ";
for(int i=words.length-1;i>=0;i--)
{
revsent=revsent+words[i]+" ";
}
System.out.println("rev str:"+revsent);											
}
}
