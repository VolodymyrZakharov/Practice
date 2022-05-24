public class Task2 {
    public static void main(String[] args) {
        boolean petyaSmile = false;
        boolean vasyaSmile = true;
        System.out.println("somthing is going on " + solution1(petyaSmile, vasyaSmile));
        System.out.println("somthing is going on " + solution2(petyaSmile, vasyaSmile));
        System.out.println("somthing is going on " + solution3(petyaSmile, vasyaSmile));
    }

    static boolean solution1(boolean petya, boolean vasya) {
        return petya & vasya || !petya & !vasya;
    }

    static boolean solution2(boolean petya, boolean vasya) {
        return !(petya ^ vasya);
    }

    static boolean solution3(boolean petya, boolean vasya) {
        return petya == vasya;
    }
}
