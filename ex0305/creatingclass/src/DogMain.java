import ex0305.creatingclass.Dog;

public class DogMain {
    public static void main(String[] args){
        Dog myDog = new Dog("Andi", "Dackel", "braun", 6);
        System.out.println(myDog);

        // Use the methods of the Dog class
        System.out.println(myDog.getDogType());
        System.out.println(myDog.getDogName());
        System.out.println(myDog.getDogColor());
        System.out.println(myDog.getDogAge());
    }
}
