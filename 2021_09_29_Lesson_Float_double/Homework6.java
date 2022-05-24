package Lesson_5_double;
// Если клиент положил в банк 1000€ под 3,5%, какая сумма будет его ждать через семь лет?

public class Homework6 {
    public static void main(String[] args) {
        double money = 1000;
        double firstYear = (money / 100) * 3.5 + money;
        double secondYear = (firstYear / 100) * 3.5 + firstYear;
        double thirdYear = (secondYear / 100) * 3.5 + secondYear;
        double forthYear = (thirdYear / 100) * 3.5 + thirdYear;
        double fifthYear = (forthYear / 100) * 3.5 + forthYear;
        double sixthYear = (fifthYear / 100) * 3.5 + fifthYear;
        double seventhYear = (sixthYear / 100) * 3.5 + sixthYear;
        System.out.println("final sum = " + seventhYear);
    }
}
