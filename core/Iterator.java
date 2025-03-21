package core;

public interface Iterator<T> {
    /**
     * checks next element's validity
     * @return true, if next element is present
     */
    boolean hasNext();

    /**
     * moves current cursor to next element
     * @return next element's reference
     */
    T next();
}
