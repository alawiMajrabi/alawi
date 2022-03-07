/**
 * Created by user on 14/01/20.
 */
public interface Queue<E> {
    boolean isEmpty();
    int size();
    void enqueue(E el);
    E dequeue();
    E first();

}
