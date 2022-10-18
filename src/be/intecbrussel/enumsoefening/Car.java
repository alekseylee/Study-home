package be.intecbrussel.enumsoefening;

public class Car  {
    Brand carBrand = Brand.BWM;
    public void myBrandCar(){
        switch (carBrand) {
            case BWM:
                System.out.println("This car is: " + carBrand);
                break;
            case RANGEROVER:
                System.out.println("This car is: " + carBrand);
                break;
            case TOYOTA:
                System.out.println("This car is: " + carBrand);
                break;
            case BUGATTI:
                System.out.println("This car is: " + carBrand);
                break;
        }
    }
    Colour colour = Colour.GOLD;
    //methode
    public void myChangeColour() {

        switch (colour) {
            case RED:
                System.out.println("New car color is " + colour);
                break;
            case BLACK:
                System.out.println("New car color is " + colour);
                break;
            case WHITE:
                System.out.println("New car color is " + colour);
                break;
            case GOLD:
                System.out.println("New car color is " + colour);
                break;
            case BLUE:
                System.out.println("New car color is " + colour);
                break;
            case SILVER:
                System.out.println("New car color is " + colour);
                break;
            default:
                System.out.println("New car color is " + colour);
                break;
        }
    }

}


