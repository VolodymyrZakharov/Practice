public class Main {

    public static void main(String[] args) {
        int a = 10;
        byte b = 5;
        short c = 23;
        long x = 78;
        byte g = 6;

        int h = b + g;
        int d = a + b;
        int e = a + c; // upcasting все что ниже инта - автоматически приводится к инту
        long f = a + x; // up casting- приводится к лонгу
        long q = x / c; // будет целое число
        long w = x % a; // upcasting, даст остаток от деления

        int z = (int)(x); // down casting, сделали из лонга инт


        System.out.println(q);
        System.out.println(w);
        System.out.println(10 % -3); // деление с остатком с отрицательтыми значениями
        System.out.println(-10 % 3);

    }
}
