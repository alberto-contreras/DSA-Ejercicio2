import java.util.LinkedList;

public class QueueImpl<E> implements Queue<E> {

    E[] data;
    int p;

    public QueueImpl(int len) {

        this.data = (E[])new Object[len];
        this.p = 0;
    }

    public void push(E e) throws QueueFullException{

        if (this.isFull()) throw new QueueFullException();

        data[p++] = e;

    }

    private boolean isFull() {
        //p  / this.data.length
        return false;
    }

    public E pop() throws QueueEmptyException {
        if (this.isEmpty()) throw new QueueEmptyException();

        E res = this.data[0];
        lshift();

        return res;
    }

    private void lshift() {
    }

    private boolean isEmpty() {
        return this.size()==0;
    }

    public int size() {
        return this.p;
    }
}
