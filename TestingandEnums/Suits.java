public enum Suits {
    HEARTS ("H", "red"),
    CLUBS ("C", "black"),
    SPADES ("S", "black"),
    DIAMONDS ("D", "red");

    final String shorthand;
    final String color;

    Suits(String shorthand, String color) {
        this.shorthand = shorthand;
        this.color = color;
    }
}
