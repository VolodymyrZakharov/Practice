import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();
        System.out.println("Введите третье число");
        double c = scanner.nextDouble();

        double mid = (a + b + c) / 3;
        double dif1 = a - mid;
        double dif2 = b - mid;
        double dif3 = c - mid;

        System.out.println(" mid = " + mid);
        System.out.println(dif1 + " " + dif2 + " " + dif3);
    }
}
