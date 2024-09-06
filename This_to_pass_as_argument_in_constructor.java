
class B
{  
    A obj;  
    B(A obj)
    {  
    this.obj=obj;  
    }  
    void display()
    {  
    System.out.println(obj.data);//using data member of A class  
    }  
} 
class A
{  
    int data=10;  
    A()
    {  
    B b=new B(this);  
    b.display();  
    }  
}
public class This_to_pass_as_argument_in_constructor
{
    public static void main(String args[])
    {  
    A a=new A();
    System.out.print(a.data);
    }
}
