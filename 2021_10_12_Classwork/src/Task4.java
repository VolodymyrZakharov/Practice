public class Task4 {

    public static void main(String[] args) {
        int mashaCredits = 490;
        int plan = 1150;
        System.out.println(calculation(mashaCredits, plan));
    }

    public static boolean calculation(int mashaCredits, int plan) {
        int mashaSpeed = 1;
        double petyaSpeed = 0.8 * mashaSpeed;
        double vasyaSpeed = mashaSpeed * 0.5;
        double vasyaSpeedMotivated = mashaSpeed;
        double speedBefore80 = mashaSpeed + vasyaSpeed + petyaSpeed; // 2.3
        double speedAfter80 = mashaSpeed + petyaSpeed + vasyaSpeedMotivated; // 2.8
        double totalCreditsFor80Percent = plan * 0.8;
        double mashaCreditsFor80Percent = totalCreditsFor80Percent / speedBefore80;
        double mashaCreditsAfter80Percent = mashaCredits - mashaCreditsFor80Percent;
        boolean result = (speedBefore80 * mashaCreditsFor80Percent + speedAfter80 * mashaCreditsAfter80Percent >= plan) & (plan >= 0);
        return result;
    }
}
