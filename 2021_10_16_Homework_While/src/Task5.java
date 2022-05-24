public class Task5 {

    public static void main(String[] args) {
        final int mashaVelocity = 50;
        final int petyaVelocity = (int) (mashaVelocity * 0.8);
        final int lazyVasya = mashaVelocity / 2;
        final int motivatedVasya = mashaVelocity;

        int sumCredits = 0;
        int monthNumber = 0;

        while (sumCredits < 2100) {
            if (sumCredits < 1370) {
                sumCredits += mashaVelocity + petyaVelocity + lazyVasya;
            } else {
                sumCredits += mashaVelocity + petyaVelocity + motivatedVasya;
            }
            monthNumber++;
        }
        System.out.println(monthNumber);
        System.out.println(sumCredits);
    }
}
