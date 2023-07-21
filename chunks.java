 import java.util.*;

class Solution 
{
    public static void main(String args[]) 
{
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the elements of the array:");
        String[] numsInput = scanner.nextLine().split(" ");
        int[] nums = new int[numsInput.length];
        
        for (int i=0;i<numsInput.length;i++)
{
            nums[i]=Integer.parseInt(numsInput[i]);
        }
        
        System.out.print("Enter the chunk size: ");
        int k = scanner.nextInt();
        
        Solution solution=new Solution();
        int[][] chunks = solution.chunkArray(nums, k);
        
        for (int i=0;i<chunks.length;i++)
{
    int[] chunk=chunks[i];
    for (int j=0;j<chunk.length;j++)
{
        int num=chunk[j];
        System.out.print(num + " ");
    }
    System.out.println();
}

        
        scanner.close();
    }
    
    public int[][] chunkArray(int[] nums, int k) {
        int n = nums.length;
        int numChunks = (n + k - 1) / k;
        int[][] result = new int[numChunks][];
        
        int chunkIndex = 0;
        int startIndex = 0;
        
        while (startIndex < n) {
            int endIndex = startIndex + k;
            
            if (endIndex > n) {
                endIndex = n;
            }
            
            int chunkSize = endIndex - startIndex;
            result[chunkIndex] = new int[chunkSize];
            
            for (int i=startIndex,j=0;i<endIndex;i++,j++)
{
                result[chunkIndex][j] = nums[i];
            }
            
            chunkIndex++;
            startIndex += k;
        }
        
        return result;
    }
}


