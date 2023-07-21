import java.util.*;
class shift
{
public static void main(String args[])
{
int[]num={10,20,30,40,50};
int[]num1=new int[num.length];
{
for(int i=0;i<num.length;i++)
{
num1[i]=num[(i+2)%num.length];
}
System.out.println("Array: " + Arrays.toString(num));
System.out.println("leftshift Array: " + Arrays.toString(num1));
}
}
}
