import java.util.Scanner;

class books
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] books = new int[n];
        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }
        int maxBooks = 0;
        int[] chosenBooks = new int[n];
        for (int i = 0; i < n; i++) {
            int amount = books[i];
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (books[j] - books[i] <= m) {
                    amount += books[j];
                    count++;
                } else {
                    break;
                }
            }
            if (count > maxBooks) {
                maxBooks = count;
                for (int k = 0; k < count; k++) {
                    chosenBooks[k] = books[i+k];
                }
            }
        }
        System.out.println(maxBooks);
        for (int i = 0; i < maxBooks; i++) {
            System.out.println(chosenBooks[i]);
        }
    }
}

