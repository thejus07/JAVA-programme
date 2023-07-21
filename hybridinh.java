class GrandFather    
{    
public void showG()    
{    
System.out.println("He is grandfather.");    
}    
}       
class Father extends GrandFather    
{    
public void showF()    
{    
System.out.println("He is father.");    
}    
}    
    
class Son extends Father    
{    
public void showS()    
{    
System.out.println("He is son.");    
}    
}    
 class Daughter extends Father    
{    
public void showD()    
{    
System.out.println("She is daughter.");    
}   
} 
class hybridinh
{
public static void main(String args[])    
{    
Daughter obj = new Daughter();    
obj.showD();    
Son obj1= new Son();  
obj1.showS();   
obj1.showF();    
obj1.showG();    
Daughter obj2 = new Daughter();  
obj2.showD(); 
obj2.showF();    
obj2.showG();     
}    
}  