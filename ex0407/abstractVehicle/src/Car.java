package  ex0407.abstractVehicle.src;;

public class Car extends Vehicle {

    public Car(){
        super("Car start", "Car stop", "Car speed", "Car direction");
    }

    @Override
    public void speed() {
        System.out.println("55");
    }
}
