import java.util.*;
class t2
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
System.out.println("The array is:");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+" ");
}
System.out.println("Duplicate elements in given array: ");  
for(int i=0;i<arr.length;i++)
{  
for(int j=i+1;j<arr.length;j++)
{  
if(arr[i]==arr[j])  
System.out.println(arr[j]);  
}  
}  
}  
}