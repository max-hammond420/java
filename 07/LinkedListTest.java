public class LinkedListTest{

    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.add("Usyd");
        list.add("UTS");
        list.add("ANU");

        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println("\n");
        
        list.set(1, "UNSW");

        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println("\n");
        
        list.remove(1);
        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println("\n");

        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for(int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println("\n");
        
        numbers.set(1, 40);

        for(int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println("\n");
        
        numbers.remove(1);
        for(int i = 0; i < numbers.size(); i++)
            System.out.print(numbers.get(i) + " ");
        System.out.println("\n");
    }
}
