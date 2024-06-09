package Structural.Adapter;

public class AdaterDemo {
    public static void main(String[] args) {
        // 기존 카카오, 네이버 로그인 로직
        KakaoUser kUser = KakaoUser.builder()
                          .id("kakUser")
                          .password("abc1234!@#")
                          .username("카카오")
                          .email("user@daum.net").build();

        NaverUser nUser = NaverUser.builder()
                          .email("user@naver.com")
                          .password("abc1234!@#")
                          .name("네이버").build();

        // 우리 프로젝트에서 사용할 땐 Adapter를 추가하여 작업 필요
        KaKaoUserAdapter kAdapter = new KaKaoUserAdapter(kUser);
        System.out.println(kAdapter.getServiceName() + " / " + kAdapter.getUserName() + " / " + kAdapter.getSecret());
        System.out.println(kAdapter.getToken());
        System.out.println();
        NaverUserAdapter nAdapter = new NaverUserAdapter(nUser);
        System.out.println(nAdapter.getServiceName() + " / " + nAdapter.getUserName() + " / " + nAdapter.getSecret());
        System.out.println(nAdapter.getToken());
    }
}
