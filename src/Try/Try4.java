package Try;

// Nested Try-Catch Block
// Catching more than 1 exception

public class Try4 {
    public static void main(String[] args) {
        int num = 10;
        try {
            System.out.println(num/0);
        } catch ( ArithmeticException error ) {
            System.out.println("Error : " + error.getMessage() );
        } catch ( Exception error ) {
            System.out.println("Error !");
        }
    }
}
