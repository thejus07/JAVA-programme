import java.util.*;
class count
{
public static void main(String args[])
{
int[][] arr={
                {0,0,1,0},
                {0,1,0,1},
                {1,0,1,1},
                {1,1,1,1}
        };
        int mr=0;
        int mc=0;
        for (int i=0;i<arr.length;i++)
{
            int c=0;
            for (int j=0;j<arr[i].length;j++)
{
                if (arr[i][j]==1) 
{
                    c++;
                }
            }
            if (c>mc) 
{
                mc=c;
                mr=i;
            }
        }
        System.out.println("max no.of 1s: " + mr);
    }
}

