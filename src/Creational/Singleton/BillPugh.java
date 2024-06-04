package Creational.Singleton;

public class BillPugh {
    private BillPugh() {}
    // 가장 널리쓰는 방식으로 Creational.Singleton 클래스가 Class Loader에 의해 로딩될 때 로딩되지 않다가
    // getInstance()가 호출될 때 JVM 메모리에 로드되고 객체를 생성하게 된다.
    // 또한 클래스가 로드될 때 객체가 생성되기 때문에 multi-thread 환경에서도 안전하게 사용이 가능하다.

    private static final class BillPughHelper {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance() {
        return BillPughHelper.INSTANCE;
    }
}
