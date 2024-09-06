/*wap to make base and derived class which should have two methods and constructors
the derived class should be named as rectangle */
import java.util.Scanner; //imported Scanner utility to use Scanner
class shape
{
    int x1,y1,x2,y2;
    Scanner s1 = new Scanner(System.in); // declaring s1 as the Scanner 
    shape()
    {
        x1=0;
        x2=0;
        y1=0;
        y2=0;
    }
    void getxyz564value()
    {
        System.out.println("Enter the co-ordinates of x1 and y1 :");
        x1=s1.nextInt(); //nextInt is used to define the data type of variable
        y1=s1.nextInt();//used s1 to scan
        System.out.println("Enter the co-ordinates of x2 and y2 :");
        x2=s1.nextInt();
        y2=s1.nextInt();
        s1.close();// closing the s1 to prevent data leak
    }
    void showxyzvalue()
    {
        System.out.println("The co-ordinates are as");
        System.out.println("x1 : "+x1+" x2 : "+x2);
        System.out.println("y1 : "+y1+" y2 : "+y2);
    }
}
public class Rectangle extends shape  //extend is used to define the base class for the derived class 
{ 
    int x,y;
    public Rectangle() 
    {
        x=0;
        y=0;
    }
    void showxyzvalue()
    {
        x=x2-x1;
        y=y2-y1;
        System.out.println("The lenth is : "+x+" and the breadth is : "+y);
    }
    public static void main(String args[]) {
        Rectangle obj= new Rectangle();// creating obj for rectangle class to access the methods of rectangle
        obj.getxyz564value();
        obj.showxyzvalue(); 
    }
}