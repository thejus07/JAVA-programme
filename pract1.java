import java.util.*;
class maxdiff
{
    public static void main(String args[])
{
        int[] array = {1,5,-2,-1,3,4,5};
        int maxdiff= findmax(array);
        System.out.println("Maximum difference: " + maxdiff);
    }

    public static int findmax(int[] array)
{
        int max = array[0];
        int min = array[0];

        for (int i=1;i<array.length;i++)
{
            if (array[i] > max)
{
                max = array[i];
            } 
else if (array[i] < min)
{
                min = array[i];
            }
        }

        return max - min;
    }
}
