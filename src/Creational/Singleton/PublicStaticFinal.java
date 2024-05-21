package Creational.Singleton;

public class PublicStaticFinal {
    // Thread Safe O

    // 단점....
    // 클래스 로더에 의해 바로 로딩되기 때문에 불필요한 메모리를 차지할 수 있음.....

    private PublicStaticFinal(){};

    private static final PublicStaticFinal INSTANCE = new PublicStaticFinal();

    public static PublicStaticFinal getInstance() {
        return INSTANCE;
    }
}
