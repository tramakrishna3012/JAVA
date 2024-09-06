import java.util.Scanner;

abstract class Dimension{
    abstract float area(float b, float h);
}

class Triangle extends Dimension {
    Scanner sc = new Scanner(System.in);

    float area(float b, float h) {
        return(float)(0.5*b*h);
}
    Triangle(){
        System.out.print("Enter height of the triangle: ");
        float h = sc.nextFloat();
        System.out.print("Enter base of the triangle: ");
        float b = sc.nextFloat();
        System.out.print("Area of Triangle = "+ area(b,h) +"sq. ft.");
    }
}

class Rectangle extends Dimension {
    Scanner sc = new Scanner(System.in);
    float area(float l, float b){
        return (float) (l*b);
    }
    Rectangle(){
        System.out.print("\n\nEnter Length of rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter breadth of rectangle: ");
        float b = sc.nextFloat();
        System.out.print("Area of rectangle = "+ area(l,b) +"sq. ft.");
    }
}

public class Prac04 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        t.area(20, 10);
        r.area(20, 10);
    }

}
