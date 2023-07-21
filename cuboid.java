import java.util.*;
class cuboid
{
	Scanner s=new Scanner(System.in);
	int lenght;
	int width;
	int height;
cuboid()
{
	Scanner s=new Scanner(System.in);
	lenght=s.nextInt();
	width=s.nextInt();
	height=s.nextInt();
	int volume=lenght*width*height;		
	System.out.println("THE VOLUME OF CUBOID : "+volume);
}
}
class ans
{
	public static void main(String[] args)
	{
		cuboid obj=new cuboid();
	}
} 

