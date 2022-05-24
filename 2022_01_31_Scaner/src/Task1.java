import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");

        if (scanner.hasNextLine()) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } else System.out.println("wrong value");
    }
}
