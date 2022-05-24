import java.util.Iterator;
import java.util.Objects;

public class Cars implements Iterator {
    int id;
    String maker;

    public Cars(int id, String maker) {
        this.id = id;
        this.maker = maker;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public String toString() {
        return this.id + " " + this.maker;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (obj.getClass() != this.getClass())
            return false;

        if (this.id == ((Cars) obj).id && this.maker.equals(((Cars) obj).maker))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maker);
    }
}
