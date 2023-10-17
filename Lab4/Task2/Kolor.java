package Task2;

public enum Kolor {

    SPARE("\u2660"),
    HEART("\u2661"),
    DIAMOND("\u2662"),
    CLUB("\u2663");

    private final String symbol;

    //construktor
    Kolor(String symbol) {
        this.symbol = symbol;
    }

    //getter
    public String getSymbol() {
        return symbol;
    }

}
