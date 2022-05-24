import java.util.Iterator;
import java.util.Objects;

public class Boc implements Iterator {
   static int width;
    int length;
    int high;


    public int volume(){
        return width * length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, high);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

