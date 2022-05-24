public class Task3 {

    public static void main(String[] args) {
        int argument1 = 5;
        int argument2 = 7;

        secondDegree(argument1);
        System.out.println(argument1 + "^2 = " + secondDegree(argument1));
        System.out.println(argument2 + "^2 = " + secondDegree(argument2));
        thirdDegree(argument1);
        System.out.println(argument1 + "^3 = " + thirdDegree(argument1));
        System.out.println(argument2 + "^3 = " + thirdDegree(argument2));
    }

    public static int secondDegree(int argument) {
        return (int) Math.pow(argument, 2);
    }

    public static int thirdDegree(int argument) {
        return (int) Math.pow(argument, 3);
    }
}
