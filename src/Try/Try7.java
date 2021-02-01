package Try;

// Throwing unchecked exception using method

public class Try7 {
    public static void main(String[] args) {
        try {
            method1();
        } catch ( ArrayIndexOutOfBoundsException err ) {
            System.out.println(err.getMessage());
        }
    }

    public static void method1() {
        throw new ArrayIndexOutOfBoundsException("Index out of range");
    }

}
