import java.util.ArrayList;
import java.util.Arrays;

public interface SongSorter<T> {
    ArrayList<T> listByTitle(ArrayList<T> x);

    ArrayList<T> listByAuthor(ArrayList<T> x);

    ArrayList<T> listByDuration(ArrayList<T> x);
}
