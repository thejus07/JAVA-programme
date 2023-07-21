import java.util.*;
class animal
{
void eat()
{
System.out.println("siiuuuuu....."  );
}
}
class dog extends animal
{
void bark()
{
System.out.println("barking....");
}
}
class babydog extends dog
{
void weep()
{
System.out.println("weeping..");
}
}
class testinheritance2
{
public static void main(String args[])
{
	babydog d=new babydog();
	d.weep();
	d.bark();
	d.eat();
}
}