abstract class AbstractClass
{
public AbstractClass()
{
System.out.println("This is constructor of abstract class");
}
public abstract void a_method();
public void normal_method()
{
System.out.println("This is a normal method of abstract class");
}
}
class SubClass extends AbstractClass
{
public void a_method()
{
System.out.println("This is abstract method");
}
}
public class khaby
{
public static void main(String args[])
{
SubClass subClass = new SubClass();
subClass.a_method();
subClass.normal_method();
}
}
