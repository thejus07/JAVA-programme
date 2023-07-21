import java.util.*;
class Defball
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of balls:");
int n = sc.nextInt();
int[] balls = new int[n];
System.out.println("Enter the weight of each ball:");
for (int i=0;i<n;i++)
{
balls[i] = sc.nextInt();
}
int res=finddefball(balls);
if (res == -1)
{
System.out.println("All balls have the same weight.");
} 
else 
{
System.out.println("The defective ball is at position " + (res+ 1) + ".");
}
}
public static int finddefball(int[] balls) {
int n = balls.length;
if (n%2==0)
{
System.out.println("The number of balls must be odd.");
return -1;
}
int left = 0;
int right = n - 1;
while (left < right)
{
int mid = (left + right) / 2;
int res = weigh(balls, left, mid, mid + 1, right);
if (res < 0)
{
right = mid;
}
else if (res > 0)
{
left = mid + 1;
}
else
{
if (left == mid)
{
return left;
}
else
{
left = mid;
}
}
}
return left;
}
public static int weigh(int[] balls, int left1, int right1, int left2, int right2) {
int weight1 = 0;
for (int i = left1; i <= right1; i++)
{
weight1 += balls[i];
}
int weight2 = 0;
for (int i = left2; i <= right2; i++)
{
weight2 += balls[i];
}
return Integer.compare(weight1, weight2);
}
}
