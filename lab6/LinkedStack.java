/**
 * Created by user on 11/01/20.
 */
public class LinkedStack<E>implements Stack<E> {
    Singlylist<E> list= new Singlylist<E>();
    @Override
    public boolean isEmpty() {
    return list.isEmpty();
    }

    @Override
    public int size() {
      return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public E pop() {
       return list.removefirst();
    }

    @Override
    public void push(E element) {
        list.addfirst(element);
    }
}
