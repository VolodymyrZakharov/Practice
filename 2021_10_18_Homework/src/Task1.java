public class Task1 {
    // У Васи проблемы, если сосед слушает музыку и еще нет семи утра или уже позже 20 часов.
    public static void main(String[] args) {
        // write your code here
        int hour = 25;
        vasiaInTrouble(hour);
        System.out.println(vasiaInTrouble(hour));
    }

    public static boolean vasiaInTrouble(int hour) {
        return (hour >= 0 & hour <= 24) & (hour < 7 | hour > 20);
    }
}
