package Task;

import java.io.*;


public class Task1 {
    public static void main(String[] args) {
        File file = new File("Data.txt");

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(file));
            while ( true ) {
                String line = fileReader.readLine();
                if ( line == null ) break;
                System.out.println(line);
            }
        } catch ( IOException err) {
            System.out.println("Error : + " + err);
        }
    }
}
