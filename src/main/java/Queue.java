public interface Queue <E> {

    public void push (E e) throws QueueFullException;
    public E pop() throws QueueEmptyException;
    public int size();
}
