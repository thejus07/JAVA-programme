import java.util.*;
class cs
{
	int width;
	int height;
	int depth;
}
class v
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		cs obj=new tr();
		obj.width=s.nextInt();
		obj.height=s.nextInt();
		obj.depth=s.nextInt();
		int cu=obj.width*obj.height*obj.depth;
		System.out.println(cu);
	}
