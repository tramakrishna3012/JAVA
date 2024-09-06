public class ThrowArithmeticException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a /b; // this will throw ArithmeticException
        System.out.println("The result is " + c);
    }
}