package Practice;

// Making an example program to handle a few exception

import java.util.HashSet;
import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        // Handling Arithmetic Exception
        // Occurs when some arithmetic counting have abnormal result like 'infinity'
        int num1 = 5;
        try {
            System.out.println(num1/0);
        } catch ( ArithmeticException error ) {
            System.out.println("1. Error : " + error);
        }

        // Handling ArrayStoreException
        // Occurs when some array object is assined with different types of objects
        Object num2[] = new Long[1];
        try {
            num2[0] = 1;
        } catch ( ArrayStoreException err ) {
            System.out.println("2. Error : " + err);
        }

        // Handling ClassCast Exception
        Object obj = new Integer(100);
        try {
            System.out.println((String)obj);
        } catch ( ClassCastException err) {
            System.out.println("3. Error : " + err);
        }

        // Handling ArrayIndexOutOfBounds Exception
        // Occurs when some value assigned to array but the index is out of range
        int num3[] = new int[1];
        try {
            num3[2] = 5;
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("4. Error : " + err);
        }

        // Handling StringIndexOutOfBounds Exception
        // Occurs when changes some characters but the index is out of range
        StringBuffer sentence = new StringBuffer("hello");
        try {
            sentence.setCharAt(5,'s');
        } catch ( StringIndexOutOfBoundsException  err) {
            System.out.println("5. Error : " + err);
        }

        // Handling NegativeArraySizeException
        // Occurs when array have a negative value while declare
        try {
            int num4[] = new int[-1];
        } catch ( NegativeArraySizeException err ) {
            System.out.println("6. Error : " + err);
        }

        // Handling NoSuchElementException
        // Occurs when a method access an iterable object beyond its maximum limit
        // It's indicates that there are no more elements remaining to interate over in an enumeration

        Set hshSet = new HashSet();
        Hashtable hshtable = new Hashtable();
        try {
            hshSet.iterator().next();
            hshtable.elements().nextElement();
        } catch(NoSuchElementException err) {
            System.out.println("7. Error : " + err);
        }

        // Handling NullPointerException
        // Occurs when we reference an object which has a null value
        String ptr = null;

        try {
            if ( ptr.equals("test") ) System.out.println("No Error");
        } catch ( NullPointerException err ) {
            System.out.println("8. Error : " + err);
        }


        // Handling NumberFormatException
        // Occurs when we parse string to int but have non-numerical value
        String str = "Not Numerical";

        try {
            Integer num5 = Integer.parseInt(str);
        } catch ( NumberFormatException err ) {
            System.out.println("9. Error : " + err);
        }


    }
}
