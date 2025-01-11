package ex0407.abstractVehicle.src;

public class Boat extends Vehicle {

    public Boat() {
        super("Boat start", "Boat stop", "Boat speed", "Boat direction");
    }

    @Override
    public void speed() {
        System.out.println("35");
    }
}
