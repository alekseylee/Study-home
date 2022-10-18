package be.intecbrussel.enumsoefening;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
//        Car car = new Car();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a Brand your car: ");
//
//        Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase());
//        Brand n1 = Brand.TOYOTA;
//        n1.defaultBrand();
//        System.out.println("Your car same like default car: " + n1.equals(brand));
//
//        Brand[] myCarBrand = Brand.values();
//        for(Brand bra: myCarBrand) {
//            System.out.println("\tCar index is: " + " " + bra.ordinal() + " for " + bra);
//        }
//
//        System.out.print("\tEnter a colour for your car: ");
//
//        Colour col = Colour.valueOf(scanner.nextLine().toUpperCase());
//        Colour c1 = Colour.BLUE;
//        c1.defaultColour();
//
//        car.buildCar(col);
//
//        Colour[] myColArr = Colour.values();
//        for(Colour col1 : myColArr) {
//            System.out.println(col + " with index " + col.ordinal());
//        }

//        System.out.println(Colour.BLUE.getColourCode());

        Day today = Day.WEDNESDAY;
        System.out.println("Today is: " + today);
    }
}
