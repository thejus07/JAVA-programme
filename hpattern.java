import java.util.*;
class star
{
public static void main(string args[]) 
{
for (int i=0;i<7;i++)
 {
for (int j=0;j<7;j++) 
{
if (j==0||j==6||(i==3 && j>0 && j<6)) 
{
System.out.print("$");
} 
else
{
System.out.print("#");
}
}
System.out.println();
}
}
}