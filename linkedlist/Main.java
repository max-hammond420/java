public class Main {
    public static void main(String[] args) {

    }
}

class LinkedList<T> {

    private int size = 0;
    private Node<T> root;

    public int size() {
        return this.size;
    }

    public void add(Node<T> element) {
        if (this.size == 0) {
            root = element;
            this.size++;
        }
        else {
            Node<T> currentElement = root;
            while (currentElement.getChild() != null) {
                currentElement = currentElement.getChild();
            }
            this.size++;
            currentElement.addChild(element);
        }
    }

    public T set(int index, T element) {

    }

    public T get(int index) {

    }

    public T remove(T element) {

    }
}

class Node<E> {
    private E element;
    private Node<E> child;
    private Node<E> parent;
    private int index;

    public Node(E element, Node<E> chlid) {
        this.element = element;
        this.child = child;
    }

    public void addChild(Node<E> element){
        this.child = element;
    }

    public int getIndex() {
        return this.index;
    }

    public Node<E> getParent() {
        return this.parent;
    }

    public Node<E> getChild() {
        return this.child;
    }
}
