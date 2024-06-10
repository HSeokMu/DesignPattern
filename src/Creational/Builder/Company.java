package Creational.Builder;

public class Company {
    private final int cpId;
    private final String cpName;
    private final String cpNumber;

    public Company(int cpId, String cpName, String cpNumber) {
        this.cpId = cpId;
        this.cpName = cpName;
        this.cpNumber = cpNumber;
    }

    @Override
    public String toString() {
        return String.format("회사ID: %d, 회사명: %s, 회사번호: %s", cpId, cpName, cpNumber);
    }

    public static class builder {
        private int cpId;
        private String cpName;
        private String cpNumber;

        public builder setCpId(int cpId) {
            this.cpId = cpId;
            return this;
        }

        public builder setCpName(String cpName) {
            this.cpName = cpName;
            return this;
        }

        public builder setCpNumber(String cpNumber) {
            this.cpNumber = cpNumber;
            return this;
        }

        public Company build() {
            return new Company(cpId, cpName, cpNumber);
        }
    }
}
