import java.util.Scanner;
class rotate 
{
public static void main(String args[])
{
Scanner in= new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int n=in.nextInt();
int[] nums=new int[n];
System.out.println("Enter the elements of the array: ");
 for (int i=0;i<n;i++)
{
 nums[i]=in.nextInt();
}

for(int i=0;i<n;i+=2) 
{
if(i+1<n)
 {
int temp=nums[i];
nums[i]=nums[i + 1];
nums[i+1]=temp;
}
}
System.out.print("The rearranged array is: ");
for (int i= 0; i<n; i++) 
{
System.out.print(nums[i] + " ");
}
System.out.println();
}
}