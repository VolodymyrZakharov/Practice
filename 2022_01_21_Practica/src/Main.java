import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String shortestOrLongest (List < String > list) {
            String res = list.get(0);
            String minSizeElement = list.get(0);
            int indexMinElement = 0;
            String maxSizeElement = list.get(0);
            int indexMaxElement = 0;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).length() < minSizeElement.length()) {
                    minSizeElement = list.get(i);
                    indexMinElement = i;
                } else if (list.get(i).length() > maxSizeElement.length()) {
                    maxSizeElement = list.get(i);
                    indexMaxElement = i;
                }
            }
            if (indexMinElement < indexMaxElement) {
                res = minSizeElement;
            } else if (indexMaxElement < indexMinElement)
                res = maxSizeElement;
        }
        return res;
    }

    public boolean balancedBrackets(String str) {
        char[] chars = str.toCharArray();
        Deque<Character> brackets = new ArrayDeque<>();

        for (char letter: chars){
            if (letter == '(' || letter == '{' || letter == '[')
                brackets.addFirst(letter);
            else  if (letter == ')' && brackets.getFirst() == '(' ||
                    letter == '}' && brackets.getFirst() == '{' ||
                    letter== ']' && brackets.getFirst() == '[')
                brackets.removeFirst();
        }
        if (brackets.size() == 0)
            return true;
        return false;
    }

}
