import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
/*
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        FileOperations.writeToFile(list, "file.txt");

        System.out.println(FileOperations.readFromFile("file.txt"));

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list1.add(33);
        list1.add(45);
        list1.add(2);
        FileOperations.writeNumbers(list1, "output1.txt");

        System.out.println(FileOperations.readNumbers("file1.txt"));

        int[] array1 = {2, 4, 6, 8, 55};
        int[] array2 = {1, 7, 23, 54, 77};
        int[] res = merge(array1, array2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

        Classwork one = new Classwork();
        //System.out.println(one.task1("file.txt"));
        //System.out.println(one.task2("file.txt"));
        //System.out.println(one.task3("file.txt"));
        Random rnd = new Random();
        List<People> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(i, new People("name" + (i+1), "family" + (i+1), "equipment" + (i+1), rnd.nextInt(60)));
        }
       // System.out.println(list);
        System.out.println(Classwork.task5(list)); ;
        //FileOperations.writeToFile(list, "file.txt");
 */

        String res;
        task4("hello world", "file.txt");
    }

    public static void task4(String str, String filename) throws IOException {
        try (PrintWriter pw = new PrintWriter(filename);) {
            pw.write("ccc");
        }
    }
}
