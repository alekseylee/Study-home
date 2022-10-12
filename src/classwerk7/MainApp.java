package classwerk7;

public class MainApp {
    public static void main(String[] args) {



        Coffee coffee1 = new Coffee("arabica");
        Coffee coffee2 = new Coffee("robusta");
        Coffee coffee3 = new Coffee("arabica", true);
        Coffee coffee4 = new Coffee("arabica", true, true);
        Coffee coffee5 = new Coffee();

        // get temperatures
        System.out.println("coffee1 temperature: " + coffee1.getTemperature());
        System.out.println("1 hour later");
        coffee1.setTemperature(40);
        System.out.println("coffee1 temperature: " + coffee1.getTemperature());
        System.out.println("coffee2 temperature: " + coffee2.getTemperature());
        System.out.println("coffee3 temperature: " + coffee3.getTemperature());
        System.out.println("coffee4 temperature: " + coffee4.getTemperature());
        System.out.println("coffee5 temperature: " + coffee5.getTemperature());

    }
}
