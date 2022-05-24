public class StringBuilder implements IConcatenator {

    @Override
    public String concatenate(String[] strings) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
