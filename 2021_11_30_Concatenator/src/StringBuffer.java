public class StringBuffer implements IConcatenator {

    @Override
    public String concatenate(String[] strings) {
        java.lang.StringBuffer sbuf = new java.lang.StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            sbuf.append(strings[i]);
        }
        return sbuf.toString();
    }
}
