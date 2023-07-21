import java.util.*;
class icct{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int[] nums = new int[7];
System.out.println("Enter the elements of the array: ");
for(int i=0;i<7;i++)
{
nums[i] = sc.nextInt();
}
System.out.println("Enter the target: ");
int target = sc.nextInt();
int result = search(nums, target);
System.out.println("The index of the target is: " + result);
}
public static int search(int[] nums, int target)
{
int left = 0;
int right = nums.length - 1;
while (left <= right)
{
int mid = left + (right - left) / 2;
if (nums[mid] == target)
{
return mid;
}
if (nums[left] <= nums[mid])
{
if (target >= nums[left] && target < nums[mid])
{
right = mid - 1;
} 
else 
{
left = mid + 1;
}
}
 else
{
if (target > nums[mid] && target <= nums[right])
{
left = mid + 1;
} 
else 
{
right = mid - 1;
}
}
}
}
