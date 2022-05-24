public class Main {

    public static void main(String[] args) {
        IConcatenator stringConcat = new StringConcatenator();
        IConcatenator stringBuilder = new StringBuilder();
        IConcatenator stringBuffer = new StringBuffer();
        IConcatenator charArray = new CharArray();
        ConcatenationTester tester = new ConcatenationTester();

        String[] array = new String[]{"hello", "world"};

        System.out.println(stringConcat.concatenate(array));
        System.out.println(stringBuilder.concatenate(array));
        System.out.println(stringBuffer.concatenate(array));
        System.out.println(charArray.concatenate(array));

        System.out.println(tester.test(stringConcat, "Hello world guys", 100000));
        System.out.println(tester.test(stringBuilder, "Hello world guys", 100000));
        System.out.println(tester.test(stringBuffer, "Hello world guys", 100000));
        System.out.println(tester.test(charArray, "Hello world guys", 100000));

    }
}
