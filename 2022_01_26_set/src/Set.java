public interface Set<T> extends Iterable<T>{

    boolean add (T elt);

    boolean remove(T elt);

    boolean contains(T elt);

    int size();

    void addAll(Set<T> another);

    void removeAll(Set<T> another);

    void retainAll(Set<T> another);

}
