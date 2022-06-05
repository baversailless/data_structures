import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList<>();

    public void push(E obj) {
        list.addLast(obj);

    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void pop() {

        if (isEmpty())
        {
            System.out.println("Queue is empty");
        }
        list.removeFirst();

    }

    public E top() {
        if (isEmpty())
        {
            System.out.println("Queue is empty");
        }
        return list.peekFirst();
    }

    public void multipop(int k) {
        for(int i=0; i<k; i++)
        {
            if (isEmpty())
            {
                System.out.println("Queue is empty");
            }
            list.removeFirst();
        }

    }
}
