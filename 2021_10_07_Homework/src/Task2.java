public class Task2 {

    public static void main(String[] args) {
        double masha = 0.5;
        double petya = masha / 2;
        double vasya = 4 * (masha + petya);
        sum(masha, petya, vasya);
    }

    public static void sum(double masha, double petya, double vasya) {
        System.out.println("Сумарно съели пирогов " + (masha + petya + vasya));
    }
}
