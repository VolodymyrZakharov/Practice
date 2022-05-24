import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Input {

    final static String FILE = "input.txt";

    public static void main(String[] args) throws IOException {

        InputStream input = new FileInputStream(FILE);

        byte[] bytes = new byte[input.available()];
        int num = input.read(bytes);
        String res = new String(bytes);

        System.out.println(res);
        System.out.println(Arrays.toString(bytes));
        System.out.println(num);
    }
}
