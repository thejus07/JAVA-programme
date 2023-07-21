import java.util.*;
class matrix
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int[][] matrix = new int[4][4];
int l=0;
int r=0;
System.out.println("Enter values for the matrix: ");
for (int i=0;i<4;i++)
{
for (int j=0;j<4;j++)
{
 matrix[i][j]=sc.nextInt();
}
}
for (int i=0;i<4;i++)
{
l+= matrix[i][i];
}
for (int i=0;i<4;i++)
{
r+=matrix[i][3-i];
}
System.out.println("sum of left diagonal: " +l);
System.out.println("sum of right diagonal: " +r);
}
}