package ex0504.exceptionExample.src.code;

public class PhoneExceptionTester {

    public static void main(String[] args){
        String[] numbers = new String[] {"123-4567", null, "234-4567", "345-5678"};

        System.out.println("numbers.len=" + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            try {

                System.out.println(new Phone("iPhone", numbers[i]));
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getLocalizedMessage());
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(new Phone("iPhone", numbers[i]));
        }
    }
}
