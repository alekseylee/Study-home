package be.intecbrussel.innerClass;

public class ElectroCar {
    private int id;

    //inner non static class
    private class Motor {
        public void startMotor() {
            System.out.println("Motor is starting...");
        }
    }

    //static inner class
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }


    public ElectroCar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor1 = new Motor();
        motor1.startMotor();

        final int x =1;
        //
        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }


        System.out.println("ElectroCar " +id + " is starting");
    }
}
