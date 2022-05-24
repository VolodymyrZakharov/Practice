
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        props.load(new FileReader("program.props"));

        String name = props.getProperty("name");
        System.out.println(name);

        props.load(new FileReader("program.props"));
        String surname = props.getProperty("surname");
        System.out.println(surname);


    }
}
