import java.util.Scanner;

public class HelloWorld
 {

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        System.out.println("You entered: " + n);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string number: ");
        String a = sc.nextLine();
        System.out.println("You entered:"+ a);

        Scanner write = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        Float b = write.nextFloat();
        System.out.println("You entered:"+ b);

        Scanner add = new Scanner(System.in);
        System.out.print("Enter a double number: ");
        Double c = add.nextDouble();
        System.out.println("You entered:"+ c);

        
        int x = 10;
        int y = 9;
        System.out.println(x > y);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     
        System.out.println(isFishTasty);
    }
}