


public class Pasta implements Food {

    private int weight;

    public Pasta(int weight) {
        this.weight = weight;
    }

    public boolean isTasty() {
        return true;
    }

    public int getWeight() {
        return this.weight;
    }

    public void eat() {
        System.out.println("Pasta eaten");
    }
}
