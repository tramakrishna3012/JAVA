/*Create a base class called shape. Apart from Constructors, It contains two methods get xy564value() and show xyvalue() for accepting co-ordinates and to display the same. Create the sub class Called Rectangle which contains a method to display the length and breadth of the rectangle called showxyvalue().Illustrate the concepts of Overriding and Constructor call sequence. */
import java.util.Scanner; //imported Scanner utility to use Scanner

class shape
{
    int x,y;
    Scanner sc=new Scanner(System.in);
    shape()
    {
        x=0;
        y=0;
    }
    void getxy564value()
    {
        System.out.print("Enter the value of Co-ordinate x :");
        x=sc.nextInt();
        System.out.print("Enter the value of Co-ordinate y :");
        y=sc.nextInt();
        System.out.println("x="+x+" y="+y);
    }
    void showxyvalue()
    {
        System.out.println("x="+x+" y="+y);
    }
} 

class rectangle extends shape
{
    int l;int b;
    rectangle()
    {
        super();
        x=l;
        y=b;
    }
    void showxyvalue()
    {
        System.out.println("length="+x+" breadth="+y);
    }
}

public class Shape1
{
    public static void main(String args[])
    {
        rectangle s=new rectangle();
        s.getxy564value();
        s.showxyvalue();
    }
}