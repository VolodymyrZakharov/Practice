package Lesson_4_Int_Long_Short;

public class RealWork {
    public static void main(String[] args) {
        squareArea();
        squarePerimeter();
    }

    public static void squareArea() {
        int size = 30;
        int result = size * size;
        System.out.println(result);
    }

    public static void squarePerimeter() {
        int size = 30;
        int perimeter = 4 * size;
        System.out.println(perimeter);
    }
}
