import java.io.InvalidObjectException;
import java.util.Scanner;

public class MarksChecker {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        
        try {
            if (marks > 100) {
                throw new Exception("Invalid marks entered: " + marks);
                
            }
        } catch (InvalidObjectException e) {
            System.out.println("Exception caught: " + e.getMessage());
            throw e; // rethrow the exception
        }
        
        System.out.println("Your marks: " +marks);
        }
}