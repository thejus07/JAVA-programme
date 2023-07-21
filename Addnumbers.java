import java.util.*;
class Addnumbers
{
int num1, num2, sum;
Addnumbers() 
{
    
    }
    
    public void getnumbers()
{
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        
        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
        
        scanner.close();
    }
    
    public void add()
{
        sum = num1 + num2;
        System.out.println("Sum of"+num1+" and "+num2+" is "+sum);
    }
    
    public static void main(String args[])
{
        Addnumbers addn= new Addnumbers();
        
        addn.getnumbers();
        addn.add();
    }
}