package core;

public interface Iterable<T> extends Iterator<T> {
    /**
     * provide iterator for specific collection
     * provide generalized way to traverse over any collection, irrespective of its logic
     * @return instance of Iterator
     */
    Iterator<T> iterator();
}
