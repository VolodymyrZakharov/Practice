public class Task6 {

    public static void main(String[] args) {
        int petyaPie = 4;
        int mashaPie = petyaPie / 2;
        int piesAfterEating = petyaPie + mashaPie - 2;
        int vasyaPie = piesAfterEating + 1;
        int totalPies = vasyaPie + piesAfterEating;
        if (totalPies % 3 == 0) {
            System.out.println("Смогут поделить пирожки на троих");
        } else {
            System.out.println("Не смогут поделить");
        }
        if (totalPies / 3 >= 4) {
            System.out.println("Маша будет счастлива");
        } else {
            System.out.println("Маша не будет счастлива");
        }
    }
}
