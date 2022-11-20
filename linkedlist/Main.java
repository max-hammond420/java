class LinkedList<T> {

    private Node<T> root;
    private int size = 0;

    public LinkedList() {
        root = null;
    }

    public int size() {
        return this.size + 1;
    }

    public void add(T element) {
        // setting the root node, if none exists
        if (root == null) {
            root = new Node<T>(element);
        } else {
            Node<T> currentElement = root;
            while (currentElement.getChild() != null) {
                currentElement = currentElement.getChild();
            }
            currentElement.addChild(new Node<T>(element));
        }
        // increase size of the LinkedList
        this.size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return null;
        }
        // finds the index where the element is
        Node<T> current = root;
        for (int i = 0; i < index; i++) {
            current = current.getChild();
            if (i == index) {
                return current.getChild(); 
            } 
        }
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }

        Node<T> current = root;
        for (int i = 0; i < index; i++) {
            current = current.getChild();
        }
        if (index == size) {
            current.addChild(new Node<T>(element, null));
        } else {
            current.addChild(new Node<T>(element, current.getChild()));
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        } 
        Node<T> current = root;
        for (int i = 0; i < index; i++) {
            current = current.getChild();
        }
        // child is to remove
        Node<T> child = current.getChild();
        if (child == null) {
            current.addChild(null);
        } else {
            current.addChild(child.getChild());
        }
    }
}

class Node<E> {
    private Node<E> child;
    private int index;

    public Node(E element, Node<E> child) {
        this.element = element;
        this.child = child;
    }

    public void addChild(Node<E> element){
        this.child = element;
    }

    public Node<E> getChild() {
        return this.child;
    }
}
