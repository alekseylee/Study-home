package be.intecbrussel.enumsoefening;

public class MainApp {
    public static void main(String[] args) {

        Car car = new Car();

        Brand[] myBrands = Brand.values();
        for (Brand bra : myBrands) {
            System.out.println("\tThe index of brands: " + bra.ordinal() + " for " + bra);
        }
        car.myBrandCar();

        Colour[] myColor = Colour.values();
        for(Colour col: myColor) {
            System.out.println("\tThe index of colours: " + " " + col.ordinal() + " for " + col);
        }
        car.myChangeColour();

        Day today = Day.TUESDAY;
        System.out.println("Today is " + today);
    }
}