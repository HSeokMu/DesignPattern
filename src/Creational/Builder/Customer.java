package Creational.Builder;

public class Customer {
    private int id;
    private String name;
    private String phoneNumber;

    public Customer(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, PhoneNumber: %s", id, name, phoneNumber);
    }
}
