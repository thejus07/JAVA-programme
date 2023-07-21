import java.util.*;
class t1
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int r= input.nextInt();
System.out.print("Enter the number of columns: ");
int col= input.nextInt();
int[][]mat= new int[r][col];
System.out.println("Enter the matrix elements: ");
for (int i=0;i<r;i++)
{
for (int j=0;j<col;j++)
{
mat[i][j]=input.nextInt();
}
}
System.out.println("The wave form is: ");
for (int j=0;j<col;j++)
{
if (j%2==0)
{
for(int i=0;i<r;i++)
{
System.out.print(mat[i][j]+"");
}
}
else
{
for(int i=r-1;i>=0;i--)
{
System.out.print(mat[i][j]+"");
}
}
System.out.print("");
}
System.out.println();
}
}