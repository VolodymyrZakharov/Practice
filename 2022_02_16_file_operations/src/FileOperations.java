import java.io.*;
import java.util.ArrayList;
import java.util.List;

// TODO implement
public class FileOperations {

    /**
     * Writes the strings into the file, one string as one line
     *
     * @param strings
     * @param filename
     */
    public static void writeToFile(List<String> strings, String filename) throws IOException {
        try (PrintWriter pw = new PrintWriter(filename);) {
            for (String str : strings) {
                pw.println(str);
            }
        }
    }

    /**
     * Creates a list of strings based on the file
     *
     * @param filename
     * @return
     */
    public static List<String> readFromFile(String filename) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) {
                list.add(line);
                line = br.readLine();
            }
        }
        return list;
    }

    /**
     * Write the numbers into the file so that the file has one string composed from the numbers written one by
     * one with the delimiter " ".
     * <p>
     * {4, 15, -9} -> "4 15 -9"
     *
     * @param numbers
     * @param filename
     */
    public static void writeNumbers(List<Integer> numbers, String filename) throws IOException {

        StringBuilder sb = new StringBuilder();
        try (PrintWriter pw = new PrintWriter(filename);) {
            for (int num : numbers) {
                sb.append(num + " ");
            }
            pw.write(String.valueOf(sb));
        }
    }

    /**
     * "4 15 -9" -> {4, 15, -9}
     *
     * @param filename
     * @return
     */
    public static List<Integer> readNumbers(String filename) throws IOException {
        List<Integer> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) {
                String[] lineArray = line.split(" ");
                for (String num : lineArray) {
                    list.add(Integer.valueOf(num));
                }
                line = br.readLine();
            }
        }
        return list;
    }
}