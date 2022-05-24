import java.util.Arrays;

public class ConcatenationTester {
    /**
     * The method test the performance of concatenation using "concatenator", adding the "string" "number" times to itself
     *
     * @param concatenator - the way (implementation) to test performance with
     * @param string       to concatenate
     * @param number       times to concatenate
     * @return the time taken for the concatenation with "concatenator"
     */

    // TODO measure the time taken for using concatenator.concatenate()
    public long test(IConcatenator concatenator, String string, int number) {
        long currentTimeMillis = System.currentTimeMillis();
        String[] strings = composeStrings(string, number);
        concatenator.concatenate(strings);
        return System.currentTimeMillis() - currentTimeMillis;
    }

    //TODO implement the method. It must compose a String array from the string number times
    private String[] composeStrings(String string, int number) {
        String[] strings = new String[number];

        Arrays.fill(strings, string);

        /*for (int i = 0; i < number; i++) {
            strings[i] = string;
        }*/
        return strings;
    }
}