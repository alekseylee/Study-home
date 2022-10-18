package be.intecbrussel.enumsoefening;

public class Car {
    Colour colour;

    public Car(Colour colour) {
        this.colour = colour;
    }
    public Car() {

    }

    public void buildCar(Colour col){
        switch(col) {
            case RED:
                System.out.println("I build a red car.");
                break;
            case BLUE:
                System.out.println("I build a blue car.");
                break;
            case WHITE:
                System.out.println("I build a yellow car.");
                break;
            case BLACK:
                System.out.println("I build a black car.");
                break;
            case GOLD:
                System.out.println("I build a gold car.");
                break;
            case SILVER:
                System.out.println("I build a silver car.");
                break;

            default:
                System.out.println("I don't know which colour I want to build.");
                break;
        }
    }
}

