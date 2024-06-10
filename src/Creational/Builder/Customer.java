package Creational.Builder;

public class Customer {
    private final int id;
    private final String name;
    private final String phoneNumber;

    public Customer(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public static class builder {
        private int id;
        private String name;
        private String phoneNumber;

        public builder() {

        }

        public builder setId(int id) {
            this.id = id;
            return this;
        }

        public builder setName(String name) {
            this.name = name;
            return this;
        }

        public builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Customer build() {
            return new Customer(id, name, phoneNumber);
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, PhoneNumber: %s", id, name, phoneNumber);
    }
}
