import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("g");
        list.add("g");
        System.out.println(Task3.nameByNumber(list, "a"));
    }
}
