
public class Monster {

    private int weight; // weight in kilograms
    private boolean hungry;
    private boolean angry;

    // implement the constructor
    public Monster ( int weight ) {
        this.weight = weight;
    }

    // implement this method
    public void feed ( Food food ) {
        if (food.isTasty()) {
            this.angry = false;
        } 
        else if (Double.valueOf(food.getWeight()) < Double.valueOf((this.weight*1/10))) {
            this.hungry = true; 
        }
        else {
            hungry = false;
        }

        if (hungry) {
            food.eat();
        }
    }

    public void pet () {
        if ( hungry ) {
            if ( angry ) {
                System.out.println ("Monster has eaten you");
            }
            else {
                System.out.println("Monster has bitten you");
            }
        }
        else {
            if ( angry )
                System.out.println("Monster is content");
            else {
                System.out.println("Monster loves you");
            }
        }
    }

    public static void main(String[] args){

        Monster m1 = new Monster(30);

        m1.feed(new Sandwich(5));
        m1.pet();

        Monster m2 = new Monster(60);

        m2.feed(new Sandwich(3));
        m2.pet();
    }
}
