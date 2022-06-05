import java.util.Arrays;

public class MyArrayList<E> implements MyList<E>{
    private int size = 0;
    private int capacity = 10;
    private Object[] elements;

    public MyArrayList() {
        elements = new Object[capacity];
    }

    @Override
    public void add(E obj) {
        if(size >= capacity) {
            if(capacity == 0) capacity = 1;
            int newSize = capacity * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = obj;
    }

    @Override
    public void add(E obj, int index) {
        if(size >= capacity) {
            if(capacity == 0) capacity = 1;
            int newSize = capacity * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        for(int i = size-1; i>=index; i--)
        {
            elements[i+1]=elements[i];
        }
        elements[index] = obj;
        size++;
    }

    @Override
    public void remove(E obj) {
        int index = indexOf(obj);
        removeAt(index);
    }


    public void removeAt(int index) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Incorrect index!");

        for(int i = index; i < size-1; i++)
        {
            elements[i] = elements[i+1];
        }
        elements[size-1]=0;
        size--;
    }

    @Override
    public void set(E obj, int index) {
        if(index < 0 || index >= size)
            throw new ArrayIndexOutOfBoundsException("Incorrect index!");
        elements[index] = obj;
    }

    @Override
    public int indexOf(E obj) {
        for(int i = 0; i < size; i++)
        {
            if(elements[i] == obj) return i;
        }
        return -1;
    }

    @Override
    public boolean cointains(E obj) {
        return indexOf(obj)!= -1;
    }

    @Override
    public int length() {
        return size;
    }


    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of Bounds");
        }
        return (E)elements[index];
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
        return (E[]) Arrays.stream(elements).toArray();
    }

    @Override
    public String toString() {
        // [1,2,3,4,5]
        String res = "[";
        for(int i = 0; i < size; i++) {
            res = res + elements[i] + ", ";
        }
        return res.substring(0, res.length()-2) + "]";
    }
}


