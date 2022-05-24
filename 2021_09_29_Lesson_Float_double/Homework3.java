package Lesson_5_double;
// write a formula for calculating the cost of the euro

public class Homework3 {
    public static void main(String[] args) {
        double euro = 100.5;
        System.out.println(euro + " euro = " + currencyConverter(euro) + " usd");
    }

    public static double currencyConverter(double money) {
        double rateOfExchange = 1.1;
        return rateOfExchange * money;
    }
}
