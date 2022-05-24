package Lesson_6_Char_String;

// Show your CV data at different rows
public class Homework2 {
    public static void main(String[] args) {
        viewDataCV();
    }

    public static void viewDataCV() {
        String firstName = "Volodymyr";
        String secondName = "Zakharov";
        int age = 28;
        String address = "Germany, Hamburg, Berner Heerweg, 130";
        String profession = "Web Developer";
        char quotes = '\"';
        char newLine = '\n';
        char space = ' ';
        System.out.println("First name:" + space + firstName + newLine + "Second name:" + space + secondName + newLine + "Age:" + space + age + newLine + "Profession:" + space + quotes + profession + quotes + newLine + "Address:" + space + address);
    }
}
