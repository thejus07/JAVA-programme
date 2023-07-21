import java.util.*;
class neg
{
public static void main(String args[])
{
  int arr[]={-5,8,-3,-2,10};
  int i,count=0,j=0;
  int size=arr.length;
  for(i=0;i<size;i++)
  {
    if(arr[i]<0)
	{
	  count++;
	  arr[j]=arr[i];
	  j++;
	  }
	  }
	  System.out.println("negative digits:"+count);
	  for(i=0;i<count;i++)
	  {
	  System.out.print(arr[i]);
	  }
	  }
	  