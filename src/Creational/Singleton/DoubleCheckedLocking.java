package Creational.Singleton;

public class DoubleCheckedLocking {
    private DoubleCheckedLocking() {};
    private static DoubleCheckedLocking instance;

    public static DoubleCheckedLocking getInstance() {
        // thread1, thread2가 있을 때
        if(instance == null) {
            // thread1, thread2 둘 다 첫번째 instance 체크 시 이미 통과했을 수도 있음
            synchronized (DoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
