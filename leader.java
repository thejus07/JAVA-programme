import java.util.*;
class leader
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int n = input.nextInt();
int[] arr = new int[n];
for (int i = 0; i < n; i++)
{
arr[i] = input.nextInt();
}
int max = arr[n - 1];
System.out.print(max + " ");
for (int i = n - 2; i >= 0; i--) {
if (arr[i] > max) {
max = arr[i];
System.out.print(max + " ");
}
}
m3}
}