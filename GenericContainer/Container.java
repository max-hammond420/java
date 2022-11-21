public class Container<T> {
    private T element;

    public Container(T element) {
        this.element = element;
    }

    public boolean isNull() {
        if (element == null) {
            return true;
        }
        return false;
    }

    public void set(T element) {
        this.element = element;
    }

    public T get() {
        return this.element;
    }
}
