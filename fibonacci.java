import java.io.*;
class Fibonacci
{  
public static void main(String args[])  
{    
 int n1=1,n2=1,n3=0,i,count=8;      
 for(i=2;i<count;++i)   
 {    
  n3=n1+n2;    
  n1=n2;    
  n2=n3;    
 } 
System.out.println(+n3);   
  
}}    