package Structural.Adapter;

public interface SocialNetworkAuthService {
    /**
     * java 8 이후 default 메소드를 사용할 수 있음.....
     * default 메소드는 오버라이딩이 강제가 아닌 선택적임 (하든가 말든가)
     */
    default void defaultMethod() {
        System.out.println("default method");
    }

    /**
     * java 8 이후 static 메소드를 사용할 수 있음.....
     * 인터페이스를 구현하는 클래스에서 재정의 불가능
     * @param target
     */
    static void socialLogin(SocialNetworkAuthTarget target) {
        System.out.println("소셜 로그인을 시작합니다.");
        System.out.println("이용하는 서비스 : " + target.getServiceName());
        System.out.println("이름 : " + target.getUserName());
        System.out.println("토큰 : " + target.getToken());
    }

    /**
     * java 9 이후 private 메소드를 사용할 수 있음.....
     */
    static void printUser(String user){
        // static private 메소드 사용
        getUser(user);
    }

    private void printInfo(){
        System.out.println("Print Information");
    }

    private static void getUser(String user){
        System.out.println("User : "+user);
    }
}
