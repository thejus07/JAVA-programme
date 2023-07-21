import java.util.*;
class words
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter a sentence: ");
String sentence = sc.nextLine();
String[] words = sentence.split(" ");
String smallestWord=words[0];
String largestWord=words[0];
for (int i=1;i<words.length;i++)
{
if (words[i].length()<smallestWord.length())
{
smallestWord = words[i];
}
if (words[i].length()>largestWord.length()) 
{
largestWord = words[i];
}
}
System.out.println("Smallest word: " + smallestWord);
System.out.println("Largest word: " + largestWord);
}
}
