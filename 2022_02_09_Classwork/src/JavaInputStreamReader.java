import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.sql.Array;
import java.util.ArrayList;

class JavaInputStreamReader {
    public static void main(String[] args) {

        // Creates an array of character
        char[] array = new char[100];

        try {
            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("input.txt");

            // Creates an InputStreamReader
            InputStreamReader input = new InputStreamReader(file);

            // Reads characters from the file
            input.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
