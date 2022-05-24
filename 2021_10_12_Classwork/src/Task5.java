public class Task5 {

    public static void main(String[] args) {
        int weekNumber = 7;
        int temperature = -2;

        if (weekNumber == 6 & temperature >= 23 & temperature <= 29) {
            System.out.println("Дядя Вася пойдет на рыбалку");
        } else if (weekNumber == 6 & (temperature <= 23 | temperature >= 29)) {
            System.out.println("Дядя Вася останется дома" );
        } else if (weekNumber == 7 & temperature <= -5) {
            System.out.println("Дядя Вася пойдет в Баню");
        } else if (weekNumber == 7 & temperature >= -5) {
            System.out.println("Дядя Вася останется дома");
        } else if (weekNumber >= 1 & weekNumber < 6) {
            System.out.println("Дядя Вася пойдет на работу");
        } else System.out.println("Не правильный номер недели");
    }
}
