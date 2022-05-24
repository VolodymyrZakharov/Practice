package Lesson_4_Int_Long_Short;

public class HomeWorkLesson4Exercise1 {
    public static void main(String[] args) {
        areaOfRectangle();
        perimeterOfRectangle();
    }

    public static void areaOfRectangle() {
        int a = 10; // 1st side of the rectangle
        int b = 15; // 2nd side of the rectangle
        int area = a * b; // Area of the rectangle
        System.out.println("Area of rectangle = " + area + " cm^2");
    }

    public static void perimeterOfRectangle() {
        int a = 10; // 1st side of the rectangle
        int b = 15; // 2nd side of the rectangle
        int perimeter = 2 * (a + b); // Perimeter of the rectangle
        System.out.println("Perimeter of rectangle = " + perimeter + " cm");
    }
}
