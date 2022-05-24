public class Task6 {
    public static void main(String[] args) {
        int dayOfWeek = 8;
        int temperature = 25;

        switch (dayOfWeek) {
            case 1:
                System.out.println();
                break;
            case 2:
                System.out.println("Дядя Вася пойдет на работу");
                break;
            case 3:
                System.out.println("Дядя Вася пойдет на работу");
                break;
            case 4:
                System.out.println("Дядя Вася пойдет на работу");
                break;
            case 5:
                System.out.println("Дядя Вася пойдет на работу");
                break;
            case 6:
                if (temperature >= 23 && temperature <= 29) {
                    System.out.println("Дядя Вася пойдет на рыбалку");
                } else
                    System.out.println("Дядя Вася останется дома");
                break;
            case 7:
                if (temperature <= -5) {
                    System.out.println("Дядя Вася пойдет в баню");
                } else
                    System.out.println("Дядя Вася останется дома");
                break;
            default:
                System.out.println("incorrect week number");
        }
    }
}
