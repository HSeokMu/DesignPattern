package Creational.Builder;

public class RunBuilderDemo {
    public static void main(String[] args) {
        Customer cs = new Customer.builder()
                          .setId(240523001)
                          .setName("테스트")
                          .setPhoneNumber("01011112222")
                          .build();
        System.out.printf("고객 정보 : [%s]%n", cs);

        Company cp = new Company.builder()
                                .setCpId(100001)
                                .setCpName("뿌숑그룹")
                                .setCpNumber("1010111001")
                                .build();
        System.out.printf("회사 정보 : [%s]%n", cp);
    }
}
