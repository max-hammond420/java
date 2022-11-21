interface NumberCheck {
    public boolean isEven(int x);

    public default boolean isOdd(int x) { return !isEven(x); }
}

public class EvenOrOdd {
    
    public static void main(String[] args) {
    
        NumberCheck t = (x) -> x % 2 == 0;
        
        System.out.println(t.isEven(4));
        System.out.println(t.isEven(5));

        System.out.println(t.isOdd(10));
        System.out.println(t.isOdd(21));
    }
}
