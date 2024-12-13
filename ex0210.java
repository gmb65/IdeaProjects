public class MethodExercise {

    public static void main(String[] args) {
        System.out.println("The Sum is: " + MethodExercise.addNumbers(7,7));
        System.out.println("The Sum is: " + MethodExercise.multiplyNumbers(7,7));
    }

    // Add your function here:
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }
}