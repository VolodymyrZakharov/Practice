public class Task1 {
    public static void main(String[] args) {
        boolean weekday = true;
        boolean vacation = false;
        System.out.println("Vasya sleaping " + first(weekday, vacation));
    }

    static boolean first(boolean weekday, boolean vacation) {
        return vacation || weekday;
    }
}
