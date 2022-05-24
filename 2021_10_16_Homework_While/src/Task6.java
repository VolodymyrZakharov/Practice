public class Task6 {
    public static void main(String[] args) {
        int a = 1, b = 2;
        while (a <= 10) {
            System.out.print(a + " ");
            while (b <= 10) {
                System.out.print(a * b + " ");
                b++;
            }
            System.out.println();
            a++;
            b = 2;
        }
    }
}
