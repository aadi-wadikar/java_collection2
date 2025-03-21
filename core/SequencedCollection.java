package core;

public interface SequencedCollection<T> extends Collection<T> {
    boolean addFirst(T e);
    boolean addLast(T e);
    T removeFirst();
    T removeLast();
    T getFirst();
    T getLast();
}
