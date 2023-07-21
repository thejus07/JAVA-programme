import java.util.*;
class tt2
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
int temp[] = new int[arr.length];
int count = 0;
for(int i=0; i<arr.length; i++)
{
int element=arr[i];
boolean flag=false;
for(int j=0;j<count;j++)
{
if(temp[j]==element)
{
flag=true;
break;
}
}
if(flag)
{
continue;
}
for(int j=i+1;j<arr.length;j++)
{
if(arr[j]==element)
{            
temp[count++]=element;              
break;
}
}
}
System.out.println("Total Repeated elements: " + count);         
System.out.println("Repeated elements are: ");
for (int i=0; i<count;i++)
{        
System.out.print(temp[i]+" ");
}
}
}         
             
      
      
      
      
     
        
     