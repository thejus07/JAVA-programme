import java.util.*;
class matrixt
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int[][]mat=new int[r][c];
for (int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
mat[i][j]=sc.nextInt();
}
}
for(i=0;i<c;i++)
{
int s=0;
}
for(j=0;j<r;j++)
{
s=s+mat[j][i];
}
System.out.println("s");
}
}
}









