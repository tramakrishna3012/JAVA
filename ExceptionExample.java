class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args)  {
        try {
            int marks = 105;
            if (marks > 100) {
                throw new InvalidMarksException("Marks cannot be greater than 100");
            }
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
            try {
                throw e;
            } catch (InvalidMarksException e1) {                
                e1.printStackTrace();
            }
        }
    }
}