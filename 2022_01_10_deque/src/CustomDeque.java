import java.util.Iterator;

public interface CustomDeque<T> {

    void addFirst(T elt);

    T getFirst();

    T removeFirst();

    void addLast(T elt);

    T getLast();

    T removeLast();

    int size();

    Iterator<T> iterator();
}
