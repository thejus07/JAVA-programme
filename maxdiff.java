import java.util.*;
class maxdiff {
    public static void main(String args[])
{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int maxdiff= findmaxdiff(array);
        System.out.println("Maximum Difference = " + maxdiff);

        scanner.close();
    }

    public static int findmaxdiff(int[] array) {
        Arrays.sort(array);
        int maxdiff= 0;
        int n = array.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += array[i];
        }
        int subsetSum = 0;
        for (int i = 0; i < n / 2; i++) {
            subsetSum += array[i];
        }
        int otherSubsetSum = totalSum - subsetSum;
   maxdiff = otherSubsetSum - subsetSum;
        return maxdiff;
    }
}

