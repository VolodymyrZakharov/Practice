public class CharArray implements IConcatenator {

    @Override
    public String concatenate(String[] strings) {
        int size = 0;
        for (int i = 0; i < strings.length; i++) {
            size += strings[i].length();
        }
        char[] charArray = new char[size];
        int n = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length(); j++) {
                charArray[n] = strings[i].charAt(j);
                n++;
            }
        }
        return new String(charArray);

    }
}
