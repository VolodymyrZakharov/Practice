package Lesson_6_Char_String;

public class String2 {
    public static void main(String[] args) {
        helloString();
    }

    public static  void helloString() {
        String sentence = "London is the capital of Great Britain";
        int dlina = sentence.length();
        System.out.println(dlina);

        String firstword = sentence.substring(0, 6);
        System.out.println(firstword);

        String title = sentence.toUpperCase();
        System.out.println(title);

        String little = sentence.toLowerCase();
        System.out.println(little);

        String myNumber1 = "123456789";
        int trueMyNumber1 = Integer.parseInt(myNumber1);
        System.out.println(trueMyNumber1);

        String myNumber2 = "567876768";
        int trueMyNumber2 = Integer.parseInt(myNumber2);
        System.out.println(trueMyNumber2);

        String myNumber = "15 years";
/*      int age = Integer.parseInt(myNumber);
        System.out.println(age);
*/
        String strAge = myNumber.substring(0, 2);
        int trueMyNumber3 = Integer.parseInt(strAge);
        System.out.println(trueMyNumber3);

        String vasiliy = "Vasiliy";
        String letters = vasiliy.substring(2, 5);
        System.out.println(letters);

        String c = "abc".substring(1, 3) + "ghj";
        System.out.println(c);

        String q = "qwerty";
        System.out.println(q + q);

    }
}
