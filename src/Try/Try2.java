package Try;

// Trying catch ArrayOutOfBoundsException with try-catch block

public class Try2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        }
        catch ( ArrayIndexOutOfBoundsException error ) {
            System.out.println(error.getMessage());
            // Output : "Index 5 out of bounds for length 5"
        }
    }
}
