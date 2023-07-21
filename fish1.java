import java.util.*;

public class fish1 {
  public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int i,j;
      for(i=0;i<n;i++)
      {
        for(j=0;j<m;j++)
       {
        a[i][j]=sc.nextInt();
       }
      }
       int max=0;
      for(i=0;i<n;i++)
      {
        int sum=0;
        for(j=0;j<m;j++)
        {
          sum+=a[i][j];
        }
        if(sum>max)
        {
         max=sum;
        }
     }
       System.out.println(max);
    }

}