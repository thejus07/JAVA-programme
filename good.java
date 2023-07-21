import java.util.*;
class good 
{
    public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);	
        String a = sc.nextLine();
		int s = a.length();
        int r=0,mr=0;
        int last='\0';
        for (int i=0;i<s;i++) 
		{
            char p=a.charAt(i);
            if (p==last) 
			{
                r++;
                if(r>mr) 
				{
                    mr=r;
                }
            }
			else
			{
                r=1;
            }
            last=p;
        }
        if (mr >= 6) 
		{
            System.out.println("Sorry,sorry!");
        }
		else
		{
			System.out.println("Good luck!");
		}
    }
