
class Admire
{
    Admire()
    {  
    this(5);  //initiate a parameterized constructor call
    System.out.println("hello a");  
    }  
    Admire(int x)
    {  
    System.out.println(x);  
    }    
}
public class This_calling_parameterized_from_default
{
    public static void main(String args[])
    {  
    Admire a=new Admire();
    System.out.print(a);
    }
    
}
