class parent
{
	void hello()
{
	int n=3;
	System.out.println(n);
}
}
class child
{
	public static void main(String args[])
{
	parent obj=new parent();
	obj.hello();
}	
} 


