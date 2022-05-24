package Lesson_5_double;

public class Double {
    public static void main(String[] args) {
        float f1;
        double d1;
        myFloat();
    }

    public static void myFloat() {
        float a = (float) 3.6;
        float b = 3.6F;
        float c = 3.6f;
        float d = a + b + c;
        d = d / 2;
        System.out.println(d);
    }
}
