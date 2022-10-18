package be.intecbrussel.enumsoefening;

public enum Colour {
    RED(0),
    WHITE(1),
    BLUE(2),
    BLACK(3),
    GOLD(4),
    SILVER(5);

    private Colour defaultCode;
    private int colourCode;

    Colour(int colourCode) {
        this.colourCode = colourCode;
        //System.out.println("Constructor is called " + this.toString());
    }

    public void defaultColour() {
        System.out.println("The default colour is " + BLACK);
    }

    public int getColourCode() {
        return colourCode;
    }
}



