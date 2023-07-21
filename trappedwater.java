import java.util.Arrays;
class trappedwater
{
public static void main(String args[])
{
mtWater obj = new mtWater();
int[] arr = {1,3,4};
int[] result = obj.deleteBuildings(arr);
System.out.println(""+ Arrays.toString(res));
int trappedwater = (res[1]-res[0]-1) * min(arr[res[0]], arr[res[1]]);
System.out.println(" "+trappedwater);
}
int[] dbuildings(int[]arr)
{
int n=arr.length;
int left=0,right=n-1;
while (left<right)
{
if (arr[left]<arr[right])
{
left++;
}
else
{
 right--;
}
}
int[] res = {left, right};
return res;
}
 int min(int a, int b) {
        return a < b ? a : b;
    }

}







