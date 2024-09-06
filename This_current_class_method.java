
class Approach
{  
    void mature()
    {
        System.out.println("hello m");
    }  
    void negotiable()
    {  
    System.out.println("hello n");  
    this.mature(); 
    //mature();//this is applied implicitly
    }  
}  
public class This_current_class_method 
{
    public static void main(String args[])
    {  
    Approach a=new Approach();  
    a.negotiable();  
    }    
}
