package Task2;

public enum Figura {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");


    private final String value;

    Figura(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
