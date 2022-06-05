import java.util.LinkedList;

public class MyStack<E> {
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

    public E pop() {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return list.removeLast();
    }

    public E top() {
        if (isEmpty())
        {
            System.out.println("Stack is empty");
        }
        return list.peekLast();
    }


    public void multipop(int k) {

        for(int i=0; i<k; i++)
        {
            if (isEmpty())
            {
                System.out.println("Stack is empty");
            }
            list.removeLast();
        }
    }
}
