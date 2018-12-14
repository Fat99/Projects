import jdk.nashorn.internal.ir.Node;

public interface Linked<E> {
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int counter);
    boolean removeByIndex (int counter);
    boolean remove(E e);
    void RemoveLast();
    void RemoveFirst();
    void removeAll ();
}
