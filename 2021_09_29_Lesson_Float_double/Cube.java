package Lesson_5_double;

public class Cube {
    public static void main(String[] args) {
        int side1 = 20;
        int side2 = 30;
        int side3 = 40;

        int result = findCubeSquare(side1);
        System.out.println(result);

        System.out.println(findCubeSquare(side1));
        System.out.println(findCubeSquare(side2));
        System.out.println(findCubeSquare(side3));
        System.out.println(findCubePerimeter(side1));
        System.out.println(findCubePerimeter(side2));
        System.out.println(findCubePerimeter(side3));
    }

    public static int findCubeSquare(int side) {
        return 6 * side * side;
    }

    public static int findCubePerimeter(int side) {
        return 12 * side;
    }
}
