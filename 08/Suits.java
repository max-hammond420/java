public enum Suits {
    HEART ("H", "red"),
    CLUB ("C", "black"),
    DIAMOND ("D", "red"),
    SPADE ("S", "black");

    private final String shorthand;
    private final String colour;

    private Suits(String shorthand, String colour) {
        this.shorthand = shorthand;
        this.colour = colour;
    }

}
