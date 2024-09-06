
class Aspire
{
    Aspire()
    {
        System.out.println("hello a");
    }  
    Aspire(int x)
    {  
    this();  //defualt parameter constructor will be called
    System.out.println(x); 
    }
}
public class This_calling_default_from_parametrized_constructor
{
    public static void main(String args[])
    {  
    Aspire a=new Aspire(10); 
    System.out.print(a);
    }    
}
