package Lesson_6_Char_String;

public class lovelyChar {
    public static void main(String[] args) {
        helloChar1();
        helloChar2();
    }

    public static void helloChar1() {
        char c1 = 'A';
        System.out.println(c1);
        System.out.println(0 + c1);

        char c2 = '#';
        System.out.println(c2);
        System.out.println(0 + c2);

        char c3 = 999;
        System.out.println(c3);
        System.out.println(0 + c3);

        char c4 = 'Я';
        System.out.println(c4);
        System.out.println(0 + c4);
    }

    public static void helloChar2() {
        char tabulator = '\t';
        System.out.println(tabulator + "some text");    // больщой пробел или таб
        char backspace = '\b';
        System.out.println("something" + backspace);
        char newLine = '\n';
        System.out.println("text1" + newLine + "text1");
        char newPage = '\f';
        System.out.println(newPage + "Text2");
        char carriageReturn = '\r';
        System.out.println("этот текст будет перезаписан" + carriageReturn + "этим текстом");
        char doudleMark = '\"';
        System.out.println(doudleMark + "Text3" + doudleMark);
        char oneMark = '\'';
        System.out.println(oneMark + "Text4" + oneMark);
        char backslash = '\\';
        System.out.println(backslash);
        char octal = '\377';
        System.out.println(octal);
        char unicodeSymbol = '\u4345';
        System.out.println(unicodeSymbol);
        char space = ' ';
        System.out.println("text" + space + "text");
        char a = 331;
        System.out.println(a);
        char data[] = {'a', 'b', 'c'};
        System.out.println(data);
    }
}
