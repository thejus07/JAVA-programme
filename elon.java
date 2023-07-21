interface BasicAnimal
{
void eat();
void sleep();
}
class Monkey
{
public void jump()
{
System.out.println("Monkey is jumping");
}
public void bite()
{
System.out.println("Monkey is biting");
}
}
class Human extends Monkey implements BasicAnimal
{
public void eat()
{
System.out.println("Human is eating");
}
public void sleep()
{
System.out.println("Human is sleeping");
}
}

class elon
{
public static void main(String args[])
{
Human human = new Human();
human.jump();
human.bite();
human.eat();
human.sleep();
}
}
