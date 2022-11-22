import java.util.Arrays;

public abstract class Storage<T> {

    T[] elements;

    abstract void print();

    void add(T element) {
        this.elements = Arrays.copyOf(elements, elements.length + 1);  
        this.elements[elements.length-1] = element;
    }
    
}
