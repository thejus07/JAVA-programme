import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of array: ");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the elements of the array: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The array is: ");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("The reversed array is: ");
for(int i=n-1;i>=0;i--)
{
System.out.print(arr[i]+" ");
}
System.out.println();
}
}