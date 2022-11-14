package be.intecbrussel.innerClass;

public class MainApp {
    public static void main(String[] args) {
        ElectroCar electroCar = new ElectroCar(1);
        electroCar.start();

        ElectroCar.Battery battery = new ElectroCar.Battery();
    }
}
