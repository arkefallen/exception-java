package Try;

// Using 'finally' statement

public class Try6 {
    public static void main(String[] args) {
        int a[] = new int[2];

        try {
            System.out.println("Access element 3  : " + a[3]);
        }
        catch ( ArrayIndexOutOfBoundsException error ) {
            System.out.println("Exception thrown : " + error);
        }
        finally { // Will still run whether there is an error or not
            a[0] = 6;
            System.out.println("First element value : " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
