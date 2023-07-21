import java.util.*;
class perfectarray 
{
    public static void main(String args[])
{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
{
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0;i<n;i++) 
{
            int sum = 0;
            for (int j=i;j<n;j++) 
{
                sum=sum+arr[j];
                if (i*i==sum) 
{
                    count++;
                }
            }
        }
        System.out.println("Number of subarrays with perfect square sum: " + count);
    }
}