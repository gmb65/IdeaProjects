package ex0409.interfaceExample.src;

public class Car implements Vehicle, Production{
    private String type;
    private String speed;
    private String color

    public Car(String type, String speed, String color) {
        this.type = type;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void location() {
        super.location();
        return "Car location";
    }

    @Override
    public String getType() {
        return "Car type";
    }

    @Override
    public String getSpeed() {
        return "Car speed";
    }

    @Override
    public String getColor() {
        return "Car color";
    }

    @Override
    public String direction() {
        return "Car direction";
    }
}
