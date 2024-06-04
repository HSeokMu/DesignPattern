package Creational.Singleton;

import java.util.Objects;

/**
 * Eager Initialization의 단점을 보완
 *
 * 단점
 *  1. Thread-Safe 하지 않음
 */
public class LazyInit {


    private static LazyInit instance;

    private LazyInit() {  }

    public static LazyInit getInstance() {
        if(Objects.isNull(instance)) {
            return new LazyInit();
        }
        return instance;
    }
}
