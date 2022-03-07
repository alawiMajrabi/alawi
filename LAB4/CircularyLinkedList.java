package Assignments.Lab4;

public class CircularyLinkedList<E> {
    private Node<E> tail=null;

    public CircularyLinkedList() {
    }
    public boolean isEmpty(){
        return size()==0;
    }

// ////////////////////////           Q3
    public boolean equals(CircularyLinkedList l1, CircularyLinkedList l2) {
        boolean b = false;
        if (l1.size() == l2.size()){
        int n = l1.size ();
        Node<E> n1 = l1.tail.getNext();
        Node<E> n2 = l2.tail.getNext();
        while (n != 0){
        if (l1.tail.getElemnt ().equals ( l2.tail.getElemnt () ) || n1.getElemnt().equals ( n2.getElemnt() ) ){
            b = true;
        }
        else b=false;
        n1 = n1.getNext();
        n2 = n2.getNext();
        n--;
        }
        }return b;
        }

/////////////////////    Q2
    public int size(){
        int si=0;
        if (tail==null) return si;
        else si++;
        Node<E> x=tail;
        while (x.getNext()!=tail){
            si++;
            x=x.getNext();
        }
        return si;
    }
    ///////////////////////////////
    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElemnt();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElemnt();
    }
    public void addFirst(E ele){
        if (isEmpty()){
            tail=new Node<E>(ele,null);
            tail.setNext(tail);
        }
        else {
// ////////////////////////           Q1
            tail.next=new Node<E>(ele,tail.getNext());
        }
    }
    //////////////////////////////////////////
    public void addLast(E ele){
        addFirst(ele);
        tail=tail.getNext();
    }
    public E removeFirst(){
        if (isEmpty())return null;
        Node<E> x=tail.getNext();
        if (x==tail) tail=null;
        else tail.setNext(x.getNext());
        return x.getElemnt();
    }
    public void rotate(){
        if(tail !=null)
            tail=tail.getNext();
    }
    private static class Node<E>{
        private E elemnt;
        private Node<E> next;

        public Node(E elemnt, Node<E> next) {
            this.elemnt = elemnt;
            this.next = next;
        }

        public E getElemnt() {
            return elemnt;
        }


        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
