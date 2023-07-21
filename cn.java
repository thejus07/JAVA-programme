import java.util.*;

  class cn 
{
    public static void main(String args[])
{
        Scanner sc = new Scanner(System.in);
        System.out.print("real part: ");
        int a=sc.nextInt();
        System.out.print("img part: ");
        int b=sc.nextInt();
        System.out.print("real part: ");
        int c=sc.nextInt();
        System.out.print("img part: ");
        int d=sc.nextInt();
        int sumr=a+c;
        int sumi=b+d;
        System.out.println("Sum:"+sumr+"+"+sumi+"i");
        int diffr=a-c;
        int diffi=b-d;
        System.out.println("Diff:"+diffr+"+"+diffi+"i");
        int pror=(a*c)-(b*d);
        int proi=(a*d)+(b*c);
        System.out.println("Product:"+pror+"+"+proi+"i");
    }
}
