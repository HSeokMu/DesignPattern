package Creational.Builder;

public class Company {
    private int cpId;
    private String cpName;
    private String cpNumber;

    public Company(int cpId, String cpName, String cpNumber) {
        this.cpId = cpId;
        this.cpName = cpName;
        this.cpNumber = cpNumber;
    }

    @Override
    public String toString() {
        return String.format("회사ID: %d, 회사명: %s, 회사번호: %s", cpId, cpName, cpNumber);
    }

    public static class CompanyBuilder {
        private int cpId;
        private String cpName;
        private String cpNumber;

        public CompanyBuilder setCpId(int cpId) {
            this.cpId = cpId;
            return this;
        }

        public CompanyBuilder setCpName(String cpName) {
            this.cpName = cpName;
            return this;
        }

        public CompanyBuilder setCpNumber(String cpNumber) {
            this.cpNumber = cpNumber;
            return this;
        }

        public Company build() {
            return new Company(cpId, cpName, cpNumber);
        }
    }
}
