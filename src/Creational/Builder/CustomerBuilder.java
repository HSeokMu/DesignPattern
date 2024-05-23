package Creational.Builder;

public class CustomerBuilder {
    private int id;
    private String name;
    private String phoneNumber;

    public CustomerBuilder() {
        
    }

    public CustomerBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Customer build() {
        return new Customer(id, name, phoneNumber);
    }
}
