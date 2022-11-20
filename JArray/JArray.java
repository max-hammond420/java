import java.util.Arrays;

public class JArray<T> {
    private int size;
    private T[] arr;

    public JArray(int size) {
        this.size = size;
    }

    public T get(int index) {
        return arr[index];
    }

    public void set(int index, T obj) {

    }

    public void clear() {

    }

    public int length() {
        return this.size;
    }
}

