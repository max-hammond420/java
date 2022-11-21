import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public String toString() {
        return "(" + title + ", " + author + ", " + duration + ")";
    }

    public static void sortByTitle(List<Song> songs) {
        Collections.sort(songs, new Comparator<Song>() {
            public int compare(Song s1, Song s2) {
                return s1.getTitle().compareTo(s2.getTitle());
            }
        });
    }

    public static void sortByAuthor(List<Song> songs) {
        Collections.sort(songs, new Comparator<Song>() {
            public int compare(Song s1, Song s2) {
                return s1.getAuthor().compareTo(s2.getAuthor());
            }
        });
    }

    public static void sortByDuration(List<Song> songs) {
        Collections.sort(songs, new Comparator<Song>() {
            public int compare(Song s1, Song s2) {
                if(s1.getDuration() < s2.getDuration()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
    }

    public static void main(String[] args) {
        List<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Lake's End", "Cicada", 4.53));
        songs.add(new Song("Metropolis", "Berndsen", 3.18));
        songs.add(new Song("Told You!", "Cicada", 3.10));
 
        sortByTitle(songs);
        System.out.println(songs);
 
        sortByAuthor(songs);
        System.out.println(songs);
 
        sortByDuration(songs);
        System.out.println(songs);
    }
}
