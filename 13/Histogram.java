import java.util.HashMap;
import java.util.Scanner;

public class Histogram{

    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        int key = scan.nextInt();

        while(key != -1){
            if(map.containsKey(key))
                map.replace(key, map.get(key)+1);
            else
                map.put(key, 1);
            System.out.println("The number " + key + " occurs " + map.get(key) + " times.");
            key = scan.nextInt();
        }

        for(Integer k : map.keySet())
            System.out.println("The number " + k + " occurs " + map.get(k) + " times.");
    }
}
