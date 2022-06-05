public interface MyList<E> {
    void add(E obj);
    void add(E obj, int index);
    void remove(E obj);
    void removeAt(int index);
    void set(E obj, int index);
    int indexOf(E obj);
    boolean cointains(E obj);

    int length();
    E get(int index);
}
