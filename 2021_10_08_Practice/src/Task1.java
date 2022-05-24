public class Task1 {

    public static void main(String[] args) {
        double r = 6.5;
        final double pi = Math.PI;
        findPerimeter(r, pi);
        System.out.println("Perimeter of the circle = " + findPerimeter(r, pi));
        findArea(r, pi);
        System.out.println("Area of the circle = " + findArea(r, pi));
    }

    public static double findPerimeter(double r, double pi) {
        return 2 * pi * r;
    }

    public static double findArea(double r, double pi) {
        return pi * r * r;
    }
}