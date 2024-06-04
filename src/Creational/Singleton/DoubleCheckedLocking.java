package Creational.Singleton;

import java.util.Objects;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance = null;

    private DoubleCheckedLocking() {};

    public static DoubleCheckedLocking getInstance() {
        // thread1, thread2가 있을 때
        if(Objects.isNull(instance)) {
            // thread1, thread2 둘 다 첫번째 instance 체크 시 이미 통과했을 수도 있음
            synchronized (DoubleCheckedLocking.class) {
                if(Objects.isNull(instance)) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}
