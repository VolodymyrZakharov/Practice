public class Task2 {

    public static void main(String[] args) {
        double fahrenheitDegrees = 45;
        changeToCelsius(fahrenheitDegrees);
        System.out.println(fahrenheitDegrees + "F = " + changeToCelsius(fahrenheitDegrees) + "C");
    }

    public static double changeToCelsius(double fahrenheitDegrees) {
        return 5 * (fahrenheitDegrees - 32) / 9;
    }
}
