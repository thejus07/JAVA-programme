import java.util.*;
class maze
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        for(int i=0;i<n;i++)
		{
            for(int j=0;j<n;j++)
			{
                maze[i][j] = sc.nextInt();
            }
        }
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
		{
            for(int j=0;j<n;j++)
			{
                a[i][j]=Integer.MAX_VALUE;
            }
        }
        a[0][0]=0;
        for(int i=0;i<n;i++)
		{
            for(int j=0;j<n;j++)
			{
                if(maze[i][j]==1)
				{
                    continue;
                }
                if(i>0&&a[i-1][j]!= Integer.MAX_VALUE)
				{ 
                    a[i][j]=Math.min(a[i][j],a[i-1][j] + 1);
                }
                if(j>0&&a[i][j-1]!= Integer.MAX_VALUE)
				{ 
                    a[i][j]=Math.min(a[i][j], a[i][j-1] + 1);
                }
                if(i>0 && j>0 && a[i-1][j-1]!=Integer.MAX_VALUE && i==j)
				{ 
                    a[i][j]=Math.min(a[i][j],a[i-1][j-1] + 1);
                }
            }
        }
        System.out.println(a[n-1][n-1]);
    }
}