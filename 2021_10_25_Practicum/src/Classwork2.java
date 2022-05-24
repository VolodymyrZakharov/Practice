public class Classwork2 {
    // написать метод который находит число в заданной степени
    public static void main(String[] args) {
        int number = 5;
        int degree = 5;
        System.out.println(degree(number, degree));
    }

    static int degree(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }
        return result;
    }
}
