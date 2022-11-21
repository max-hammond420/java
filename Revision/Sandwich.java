


public class Sandwich implements Food {    

    private int weight;

    public Sandwich(int weight) {
        this.weight = weight;
    }

    public boolean isTasty() {
        return false;
    }

    public int getWeight() {
        return this.weight;
    }

    public void eat() {
        System.out.println("sandwich eated");
    }
}
