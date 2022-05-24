package Lesson_4_Int_Long_Short;

public class HomeWorkLesson4Exercise2 {
    public static void main(String[] args) {
        areaOfCube();
        perimeterOfCube();
    }

    public static void areaOfCube() {
        int a = 20; // side of the cube
        int area = a * a * a; // Area of the cube
        System.out.println("Area of the cube = " + area + " cm^3");
    }

    public static void perimeterOfCube() {
        int a = 20; // side of the rectangle
        int perimeter = 12 * a; // Perimeter of the cube
        System.out.println("Perimeter the of cube = " + perimeter + " cm");
    }
}
