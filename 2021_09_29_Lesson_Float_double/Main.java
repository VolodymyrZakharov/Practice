package Lesson_5_double;

public class Main {
    public static void main(String[] args) {
        int square = findRectangularSquare(10, 15);
        System.out.println(square);
        int z = findRectangularPerimeter(10, 15);
        System.out.println(z);
    }

    public static int findRectangularPerimeter(int x1, int x2) {
        return 2 * (x1 + x2);
    }

    public static int findRectangularSquare(int rectangleFirstSide, int rectangleSecondSide) {
        int result = rectangleFirstSide * rectangleSecondSide;
        return result;
    }
}
