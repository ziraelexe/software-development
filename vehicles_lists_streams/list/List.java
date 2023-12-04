package list;

public interface List<T> extends Iterable<T> {

    int size();

    void add(T value);

    boolean contains(T o);

}
