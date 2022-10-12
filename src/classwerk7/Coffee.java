package classwerk7;

public class Coffee {

    //properties
    private String coffeeType;
    private int temperature = 80;
    private static int coffeeCount = 0;

    public Coffee(){
        this("arabica");  //constructor chaining
    }
    public Coffee(String beans) {
        System.out.println("black coffee created");
        temperature = 80;
    }

    public Coffee(String beans, boolean lemon) {
        System.out.println("coffee romano created");
        temperature = 75;
    }

    public Coffee(String beans, boolean whiskey, boolean cream) {
        System.out.println("irish coffee created");
        temperature = 60;
    }

    //getters setters

    public int getTemperature() {
        return temperature;
    }

    public int setTemperature(int temperature) {
        this.temperature = temperature;
        return temperature;

    }
}
