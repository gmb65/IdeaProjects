package creatingclass;

public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    // Constructor
    public Dog(String dT, String dN, String dC, int dA){
        this.dogType = dT;
        this.dogName = dN;
        this.dogColor = dC;
        this.dogAge = dA;
    }

    public String getDogType() {
        return dogType;
    }
    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getDogName() {
        return dogName;
    }
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColor() {
        return dogColor;
    }
    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }
    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
    @Override
    public String toString(){
        return "Dog type: " + dogType + " Dog name: " + dogName + " Dog Color: " + dogColor + "  Dog age: " + dogAge;
    }
}
