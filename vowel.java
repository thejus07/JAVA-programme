import java.util.*;
class vowel
{
	public static void main(String args[])
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
		int Count = 0;
		for (String word : words) 
		{
            int vowelCount = 0;
            for(i=0;i<word.length();i++) 
			{
                char s = word.charAt(i);
				if (s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U') 
				{
                    vowelCount++;
                    Count++;
                }
            }
			System.out.println("Count of vowels in \"" + word + "\": " + vowelCount);
        }
		System.out.println("Count number of vowels: " + Count);
    }
}