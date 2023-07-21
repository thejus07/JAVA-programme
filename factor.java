import java.util.*;
class factor
{
public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = s.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}