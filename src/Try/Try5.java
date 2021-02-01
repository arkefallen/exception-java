package Try;

// Comparing 2 different exception

public class Try5 {
    public static void main(String[] args) {
        int num = 10;
        String alphabet[] = {"a","b","c"};

        try {
            System.out.println(alphabet[3]);
            System.out.println(num/0);
        } catch ( ArithmeticException error ) { // Not running this
            System.out.println("Error : " + error.getMessage());
        }
        catch ( ArrayIndexOutOfBoundsException error ) { // Will Running this
            System.out.println("Error : " + error.getMessage());
        } catch ( Exception error ) { // Not running this
            System.out.println("Error !");
        }
    }
}

// Summary : try-catch block will read first programs that have exception and directly goes to catch those errors.
