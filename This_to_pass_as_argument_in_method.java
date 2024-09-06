
class Swift
{
    void m(Swift obj)
    {  
    System.out.println("method is invoked");  
    }  
    void p()
    {  
     //this.m(this); 
        m(this);
    }
}

public class This_to_pass_as_argument_in_method
{
    public static void main(String args[])
    {
    Swift s1 = new Swift();  
    s1.p();  
    }    
}
