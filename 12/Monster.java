public class Monster {
    private int weight; // weight in kilograms
    private boolean hungry;
    private boolean angry;
    
    public Monster ( int weight ) { 
        this.weight = weight;
        hungry = false;
        angry = false;
    }

    public void feed ( Food food ) { 
        if(food.isTasty()) {
            angry = false;
        }

        if(food.getWeight() <= (weight/10)) {
            hungry = true;

        } else {
            hungry = false;
        }

        if(hungry) {
            food.eat();
        }
    }

    public void pet () {
        if ( hungry ) {
            if ( angry )
                System.out.println ("Monster has eaten you");
            else
                System.out.println("Monster has bitten you");
        } else {
            if ( angry )
                System.out.println("Monster is content");
            else
                System.out.println("Monster loves you");
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

class Sandwich implements Food {
    private boolean eaten;
    private int weight;
    private boolean tasty;

    public Sandwich(int weight) {
        this.weight = weight;
        this.tasty = true;
        eaten = false;
    }

    public boolean isTasty () {
        return tasty;
    }

    public int getWeight () {
        return weight;
    }
    
    public void eat () {
        eaten = true;
        weight = 0;
        tasty = false;
    }
}


