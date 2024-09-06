/*Write a program to find the volume of a box having its side w, h, d means width, height
and depth. Its volume is v=w*h*d and also find the surface area given by the formula
s=2(wh+hd+dw). use appropriate constructors for the above.*/
import java.util.*;

public class volume 
{
    int w,h,d,v,s;
    public volume()
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.print("The width of rectangle = ");
            w=sc.nextInt();
            System.out.print("The height of rectangle = ");
            h=sc.nextInt();
            System.out.print("The depth of rectangle = ");
            d=sc.nextInt();
            v=w*h*d;
            System.out.println("Volume is = "+v);
            s=2*(w*h+h*d+d*w);
            System.out.println("Surface area is = "+s);
            sc.close();
    }     
    public static void main(String[] args) 
    {
        volume obj = new volume();
        System.out.println(obj.v);
        System.out.println(obj.s);
    }
}