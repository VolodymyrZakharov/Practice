public class Main {

    public static void main(String[] args) {
        double someDouble = 10.5;
        float someFloat = 13.7F;
        float anotherFloat = 3.4F;

        float resultingFloat = someFloat + anotherFloat;
        double resultingDouble = someFloat + someDouble;

        int someInt = 10;
        int anotherInt = 3;
        double division = someInt / anotherInt; // 3.0
        System.out.println(division);
        double division2 = (double) (someInt) / anotherInt; // Достаточно сделать Down casting только одному аргументу
        System.out.println(division2);

        double j = 95.78;
        double k = 78.99;
        int l = (int) (j / k);
        System.out.println(l);

        System.out.println((int) (55666665565655.688));
        System.out.println((short) (32769));
        System.out.println((int) (312345600989L));

        System.out.println((byte) 129);

        float floatPlusLong = someFloat + 10L;
    }
}
