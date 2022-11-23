import java.util.*;


public class Count {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Algorithm<Integer> a = new Algorithm<>();
        int count = a.countIf(list, new oddInteger());
        System.out.println("Number of odd integers = " + count);
    }
}

interface Property<T> {
    public boolean test(T obj);
}

class oddInteger implements Property<Integer> {
    public boolean test(Integer obj) {
        if (obj %2 == 0) {
            return false;
        }
        return true;
    }
}

class Algorithm<T> {
    public int countIf(Collection<T> c, Property<T> p) {
        int count = 0;
        Iterator<T> iterator = c.iterator();
        while (iterator.hasNext()) {
            if (p.test(iterator.next())) {
                count = count + 1; 
            }
        }
        return count;
    }
}
