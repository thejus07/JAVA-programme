interface printable
{
void print();
}
interface showable
{
void show();
}
class A7 implements printable,showable
{
public void print()
{
System.out.println("hell");
}
public void show()
{
System.out.println("bruh");
}
public static void main(String args[])
{
A7 obj=new A7();
obj.print();
obj.show();
}
}