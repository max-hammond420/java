public interface Food {
    // returns whether or not the food is tasty
    public boolean isTasty ();
    // weight of the food in kilograms
    public int getWeight ();
    // when a food is consumed , its weight becomes zero
    // and it is no longer tasty .
    public void eat ();
}