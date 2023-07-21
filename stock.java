import java.util.*;
class stock
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n = sc.nextInt();
int[]price=new int[n];
System.out.println("prices:"); 
for (int i=0;i<n;i++) 
{
price[i]=sc.nextInt();
}
int maxPrice=price[0];
int maxLoss=0;
for (int i=1;i<n;i++)
{
if (prices[i]>maxPrice)
{
maxPrice=prices[i];
}
else
{
int loss=maxPrice-prices[i];
if (loss>maxLoss)
{
maxLoss=loss;
}
}
}
System.out.println("return the dofference: " + maxLoss);
}
}
