import java.util.*;

interface Property<T> {
    public boolean test(T obj);
}

class Algorithm<T> {
    
    public int countIf(Collection<T> c, Property<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}


class OddInteger implements Property<Integer> {
    public boolean test(Integer i) { 
        return i % 2 != 0; 
    }
}

class Palindrome implements Property<String> {
    public boolean test(String str) { 

        String reverseStr = "";
        
        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) 
            reverseStr += str.charAt(i);

        return str.toLowerCase().equals(reverseStr.toLowerCase());
    }
}

public class Count {
    public static void main(String[] args) {
        
        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Algorithm<Integer> a = new Algorithm<>();
        int count = a.countIf(list, new OddInteger());
        System.out.println("Number of odd integers = " + count);


        Collection<String> listString = new LinkedList<>();
        listString.add("Eye");
        listString.add("Kayak");
        listString.add("Salsa");
        listString.add("Racecar");
        
        Algorithm<String> s = new Algorithm<>();
        count = s.countIf(listString, new Palindrome());
        System.out.println("Number of palindromes = " + count);
    }
}
