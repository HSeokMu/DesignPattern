package Creational.Builder;

public class RunBuilderDemo {
    public static void main(String[] args) {
        Customer cs = new CustomerBuilder()
                          .setId(240523001)
                          .setName("테스트")
                          .setPhoneNumber("01011112222")
                          .build();
        System.out.println(String.format("고객 정보 : [%s]", cs));

        Company cp = new Company.CompanyBuilder()
                                .setCpId(100001)
                                .setCpName("뿌숑그룹")
                                .setCpNumber("1010111001")
                                .build();
        System.out.println(String.format("회사 정보 : [%s]", cp));
    }
}
