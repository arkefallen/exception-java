package Try;

// Throwing checked exception using method

import java.io.FileNotFoundException;

public class Try8 {
    public static void main(String[] args) {
        try {
            method2();
        } catch ( FileNotFoundException err ) {
            System.out.println(err.getMessage());
        }
    }

    public static void method2() throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }
}
