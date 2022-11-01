package be.intecbrussel.anonymousClass;

public class MainApp {
    public static void main(String[] args) {

        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Animal is eating....");
            }
        };

        ableToEat.eat();

    }
}
