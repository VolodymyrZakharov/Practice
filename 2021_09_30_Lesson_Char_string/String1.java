package Lesson_6_Char_String;

public class String1 {
    public static void main(String[] args) {
        String firstName = "Vova";
        String seconNname = "Zakharov";
        char copyright = '\u00A9';
        int age = 28;
        char space = ' ';
        char tab = '\t';
        char newLine = '\n';

        System.out.println(firstName + space + seconNname + space + copyright + space + age);
        System.out.println(firstName + tab + seconNname + tab + copyright + tab + age);
        System.out.println(firstName + newLine + seconNname + newLine + copyright + newLine + age);

    }
}
