package core;


/**
 * Type T is being used here
 */
public interface Collection<T> extends Iterable<T> {
    /**
     * @return number of elements present in collection
     */
    int size();

    /**
     * @return true, if elements present
     */
    boolean isEmpty();


    /**
     * @return true, if given object is present in collection
     */
    boolean contains(T e);


    /**
     * @return instance of iterator
     */
    Iterator<T> iterator();


    /**
     * @return true, if element of type T is being added
     * @throws NullPointerException if given element is null
     */
    boolean add(T e);


    /**
     * @param e of type T
     * @return true, if element is removed successfully
     * @throws NullPointerException if given element is null
     * @throws NoSuchElementException if given element is not present in collection
     */
    boolean remove(T e);



    /**
     * @param collection 
     * @return true, if given collection is equal to current cullection
     * @throws NullPointerException if given collection is null
     */
    boolean equals(Collection<T> collection);
}