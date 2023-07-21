import java.util.*;
class tmatrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int columns=sc.nextInt();
int[][] matrix = new int[rows][columns];
for (int i=0;i<rows;i++) 
{
for (int j=0;j<columns;j++)
{
matrix[i][j]=sc.nextInt();
}
}
for (int i=0;i<rows;i++)
{
Arrays.sort(matrix[i]);
}
for (int i=0;i<rows;i++)
{
int temp =matrix[i][1];
matrix[i][1]=matrix[i][2];
matrix[i][2]=temp;
}
for (int i=0;i<rows;i++)
{
for (int j=0;j<columns;j++)
{
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
}
}


