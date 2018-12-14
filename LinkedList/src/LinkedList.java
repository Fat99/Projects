import java.util.Iterator;

public class LinkedList<E> implements Linked<E>,Iterable<E>,DescendingIterator<E>{
    private Node<E> fstNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedList() {
        lstNode = new Node<E>(fstNode, null,null);
        fstNode = new Node<E>(null,null,lstNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode;
        prev.setCurrentElement(e);
        lstNode = new Node<E>(prev,null,null);
        prev.setNextElement(lstNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = fstNode;
        next.setCurrentElement(e);
        fstNode = new Node<E>(null,null,next);
        next.setPrevElement(fstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = fstNode.getNextElement();
        for( int i = 0; i < counter; i++){
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    public void RemoveLast()
    {
        if (size != 0)
        {
            if (size == 1)
            {
                fstNode = null;
                lstNode = null;
            }
            else
            {
                // До:    Head --> 3 --> 5 --> 7
                //        Tail = 7
                // После: Head --> 3 --> 5 --> null
                //        Tail = 5
                // Обнуляем 5.Next
                lstNode.prevElement.nextElement = null;
                lstNode = lstNode.prevElement;
            }
            size--;
        }
    }

    public void RemoveFirst()
    {
        if (size != 0)
        {
            // До:    Head -> 3  5
            // После: Head -------> 5

            // Head -> 3 -> null
            // Head ------> null
            fstNode = fstNode.nextElement;

            size--;

            if (size == 0)
            {
                lstNode = null;
            }
            else
            {
                // 5.Previous было 3; теперь null.
                fstNode.prevElement = null;
            }
        }
    }

    @Override
    public boolean remove(E e)
    {
        Node prev = null;
        Node current = fstNode;

        // 1: Пустой список: ничего не делать.
        // 2: Один элемент: установить Previous = null.
        // 3: Несколько элементов:
        //    a: Удаляемый элемент первый.
        //    b: Удаляемый элемент в середине или конце.

        while (current != null)
        {
            // Head -> 3 -> 5 -> 7 -> null
            // Head -> 3 ------> 7 -> null
            if (current.equals(e))
            {
                // Узел в середине или в конце.
                if (prev != null)
                {
                    // Случай 3b.
                    prev.nextElement = current.nextElement;

                    // Если в конце, то меняем _tail.
                    if (current.nextElement == null)
                    {
                        lstNode = prev;
                    }
                    else
                    {
                        // До:    Head -> 3  5  7 -> null
                        // После: Head -> 3  7 -> null

                        // previous = 3
                        // current = 5
                        // current.Next = 7
                        // Значит... 7.Previous = 3
                        current.nextElement.prevElement = prev;
                    }

                    size--;
                }
                else
                {
                    // Случай 2 или 3a.
                    RemoveFirst();
                }
                return true;
            }
            prev = current;
            current = current.nextElement;
        }
        return false;
    }

    @Override
    public boolean removeByIndex(int index) {
        if (index < 0 || index > size -1 ) {
            throw new IllegalArgumentException();
        }
        if (index == 0) {
            fstNode = fstNode.nextElement;
        } else {
            Node node = findNodeBeforeByIndex(index);
            Node tmp = findByIndex(index);
            node.nextElement = tmp.nextElement;
        }
        size--;
        return false;
    }

    private Node findByIndex(int index) {
        if (index < 0 || index > size - 1 ) {
            throw new IndexOutOfBoundsException();
        }
        int tmpIndex = 0;
        if (fstNode == null) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return fstNode;
        }

        Node node = fstNode;
        while (node.getNextElement() != null) {
            node = node.nextElement;
            tmpIndex++;
            if (tmpIndex == index) {
                return node;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public Node findNodeBeforeByIndex(int index) {
        if (index <= 0 || index > size - 1) {
            return null;
        }
        int count = 0;
        Node node = fstNode;
        while (node.nextElement != null) {
            if (count == index - 1) {
                return node;
            }
            count++;
            node = node.nextElement;
        }
        return null;
    }

    @Override
    public void removeAll() {
        Node<E> nextElement = null;
        Node<E> prevElement = null;
        size = 0;
    }

    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterarot() {
        return new Iterator<E>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter --);
            }
        };
    }

    private class Node<E> {
        private E currentElement;
        private Node<E> nextElement;
        private Node<E> prevElement;

        public E getCurrentElement() {
            return currentElement;
        }

        public Node<E> getNextElement() {
            return nextElement;
        }

        public Node<E> getPrevElement() {
            return prevElement;
        }

        private Node(Node<E> prevElement, E currentElement, Node<E> nextElement) {
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public void setCurrentElement(E currentElement) {
            this.currentElement = currentElement;
        }

        public void setNextElement(Node<E> nextElement) { this.nextElement = nextElement;}

        public void setPrevElement(Node<E> prevElement) { this.prevElement = prevElement; }
    }
}