public class EvenOrOdd {

    public static void main(String[] args) {
        NumberCheck t = (x) -> x % 2 == 0; 

        System.out.println(t.isEven(2));
        System.out.println(t.isOdd(3));
        System.out.println(t.isEven(44));
        System.out.println(t.isEven(3));

    }
}
interface NumberCheck {
    public boolean isEven(int x);

    public default boolean isOdd(int x) { return !isEven(x); }

}
