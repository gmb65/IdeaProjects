package ex0504.exceptionExample.src.code;

public class Phone {

    String phoneType;
    String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        super();

        if (phoneType == null || phoneNumber == null) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return phoneType + " " + phoneNumber;
    }
}
