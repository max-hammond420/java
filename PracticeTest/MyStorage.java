import java.util.Arrays;

public class MyStorage<T> extends Storage<T> {
    public void print() {
        System.out.println(Arrays.toString(elements));
    }
}
