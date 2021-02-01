package Try;

// Trying fix error with try-catch block

public class Try3 {
    public static void main(String[] args) {
        int num = 10;
        // Error ArithmeticException : Divided by zero
        // System.out.println(num/0);

        try {
            System.out.println(num/0);
        } catch ( ArithmeticException error ) {
            System.out.println("Error" + error.getMessage());
            // Output : Error / by zero
        }
    }
}
