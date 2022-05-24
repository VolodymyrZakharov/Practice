
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        printStreamToFile();
        printWriterToFile();
    }

    public static void printStreamToFile() throws FileNotFoundException {
        try (PrintStream ps = new PrintStream(new FileOutputStream("output.txt"));) {
            ps.println("Hello world!");
            ps.println("Hello world!");
            ps.println("Hello world!");
            ps.println("Hello world!");
        }
    }

    public static void printWriterToFile() throws IOException {
        try (PrintWriter pw = new PrintWriter("output.txt");) {
            pw.println("Hello worldf!");
            pw.println("Hello world!f");
            pw.println("Hello world!f");
            pw.println("Hello world!f");
        }
    }
}