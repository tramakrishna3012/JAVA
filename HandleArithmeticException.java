public class HandleArithmeticException {
    public static void main(String[] args) {
        try {
            ThrowArithmeticException tae = new ThrowArithmeticException();
            tae.main(args); // this will call the method that throws ArithmeticException
        } catch (ArithmeticException ae) {
            System.out.println("An arithmetic error occurred: " + ae.getMessage());
            ae.printStackTrace();
        }
    }
}