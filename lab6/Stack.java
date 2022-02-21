/**
 * Created by user on 11/01/20.
 */
public interface Stack<E> {
    boolean isEmpty();
    int size();
    E top();
    E pop();
    void  push(E element);

}
