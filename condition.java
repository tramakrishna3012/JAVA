import java.util.Scanner;

public class condition {
        static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the age :");
        int age = sc.nextInt();
            if (age>18) {
                System.out.println("Adult");
            }
            else{
                System.out.println("Not Adult");
            }
        
   }
}