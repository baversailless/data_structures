public class MyLinkedList<E> {
    private int size = 0;
    private Node tail;
    private Node head;

    private class Node<E> {
        E data;
        Node next;
        Node prev;

        public Node(E data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public void add(E obj) {
        if(size == 0) {
            head = new Node(obj, null, null);
            tail = head;
        }
        else {
            Node temp = new Node(obj, null,tail);
            tail.next = temp;
            tail = temp;
        }
        size++;
    }


    public void add(E obj, int index) {

        Node temp = new Node(obj, null, null);
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Incorrect index");
        } else if (index == size) {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
            tail.next = null;
        } else if (index == 0) {
            head.prev = temp;
            temp.next = head;
            temp.prev = null;
            head = temp;
        } else {
            Node curr = head;
            Node temp2 = null;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            temp2 = curr.next;
            temp2.prev = curr;
            curr.next = temp;
            temp.prev = curr;
            temp.next = temp2;
            temp2.prev = temp;
        }
        size++;

    }

    public void remove(E obj) {
        removeAt(indexOf(obj));
    }

    public void removeAt(int index) {
        if(head == null || index < 0 || index > size)
            throw new IndexOutOfBoundsException("Incorrect index!");
        else
        {
            if(index == 0)
            {
                head = head.next;
                size--;
            }
            else if(index == size - 1)
            {
                tail = tail.prev;
                tail.next = null;
                size--;
            }
            else
            {

                Node curr = head;
                for(int i = 0; i<index; i++)
                {
                    curr = curr.next;
                }
                curr.next.prev = curr.prev;
                curr.prev.next = curr.next;
                size--;
            }
        }
    }

    public void set(E obj, int index) {

        int q = 0;
        Node temp = head;
        if(head == null || index < 0 || index > size)
            throw new IndexOutOfBoundsException("Incorrect index!");
        else {
            while (q != index) {
                temp = temp.next;
                q++;
            }
            temp.data = obj;
        }
    }


    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
        }
        int counter = 0;
        Node cur = head;
        while(cur != null) {
            if(counter == index) {
                return (E)cur.data;
            }
            cur = cur.next;
            counter++;
        }
        return null;
    }

    public int indexOf(E obj)
    {
        int index = 0;
        Node temp;
        temp = head;
        while( temp != null)
        {
            if(obj.equals(temp.data))
            {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public boolean contains(E obj) {
        return indexOf(obj) != -1;
    }

    public void clear() {
        Node temp = head;
        while(temp != null)
        {
            Node next = temp.next;
            temp.prev = temp.next = null;
            temp.data = null;
            temp = next;
        }
        head = tail = temp = null;
        size = 0;

    }

    public int length() {
        return size;
    }

    public void swap(int ind1, int ind2) {
        E a =  get(ind1);
        E b =  get(ind2);
        set(a, ind2);
        set(b, ind1);
    }

    public void push_second(E obj) {

        add(obj, 1);
    }

    public void pop_second() {
        removeAt(1);
    }

    public E[] toArray() {


        return null;
    }

    @Override
    public String toString() {
        String res = "[";
        Node cur = head;
        while(cur != null) {
            res = res + cur.data + ", ";
            cur = cur.next;
        }
        return res.substring(0, res.length()-2) + "]";
    }
}