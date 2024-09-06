import java.util.*;

public class rama {
    public static void main(String args[]) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("The value of x=");
            int a=sc.nextInt();
            System.out.println("The value of y=");
            int b=sc.nextInt();
            int sum= a+b;
            System.out.println("Sum is="+sum);
        }
    }
}