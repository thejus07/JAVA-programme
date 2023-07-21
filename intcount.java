class intcount {
public static void main(String[] args) 
{
String input = "52prep2aration6";
int sum = 0;
char[] c= new char[20];
for (int i=0;i<input.length();i++)
 {
c[i] = input.charAt(i);

if (c[i]>='0' && c[i]<='9')
{
sum=sum+(c[i]-'0');
}
}
System.out.println(sum);
}
}
