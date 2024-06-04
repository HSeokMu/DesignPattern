package Creational.Singleton;

/**
 * 단점
 *  1. 클래스 로더에 의해 바로 로딩되기 때문에 불필요한 메모리를 차지할 수 있음
 */
public class EagerInit {
    private static final EagerInit INSTANCE = new EagerInit();

    private EagerInit(){};

    public static EagerInit getInstance() {
        return INSTANCE;
    }
}
