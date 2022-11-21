import java.util.ArrayList;

public class Song {

    private String title;
    private String author;
    private double duration;

    public Song(String title, String author, double duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getDuration() {
        return duration;
    }
}

interface SongSorter<T> {
    ArrayList<T> listByTitle(ArrayList<T> x);

    ArrayList<T> listByAuthor(ArrayList<T> x);

    ArrayList<T> listByDuration(ArrayList<T> x);
}
