import java.util.*;
class vowels
{
	public static void main(String args[])
	{
		int i,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = s.nextLine();
		char[] arr=str.toCharArray();
           
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
			{
				sum=sum+1;
			}
		}
		System.out.println(sum);
	}
}