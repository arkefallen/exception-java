package Try;

import javax.swing.*;

// Using inheritance to create a subclass from exception ( superclass (
// and then catching exception using the subclass

class ExceptionA extends Exception{}

class ExceptionB extends ExceptionA{}

class ExceptionC extends ExceptionB{}

public class Try10 {
    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        } catch ( ExceptionA a ) {
            JOptionPane.showMessageDialog(
                    null,
                    a.toString(),
                    "Exception",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        try {
            throw new ExceptionB();
        } catch ( ExceptionA b ) {
            JOptionPane.showMessageDialog(
                    null,
                    b.toString(),
                    "Exception",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        System.exit(0);
    }
}
