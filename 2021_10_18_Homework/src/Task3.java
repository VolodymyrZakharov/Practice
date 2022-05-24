public class Task3 {
    // Написать метод, определяющий является ли год високосным.
    public static void main(String[] args) {
        int year = 2000;
        isYearLeap(year);
        System.out.println(isYearLeap(year));
    }

    public static boolean isYearLeap(int year) {
        return year % 4 == 0;
    }
}
