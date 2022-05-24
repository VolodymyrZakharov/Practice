public class Task3 {

    public static void main(String[] args) {
        double inch = 45;
        changeToMeter(inch);
        System.out.println(inch + " inches = " + changeToMeter(inch) + " meters");
    }

    public static double changeToMeter(double inch) {
        return inch * 0.0254;
    }
}
