package Creational.Singleton;

/**
 * Eager Initialization 과 유사하다.
 * 다만, 인스턴스가 static block 내에서 만들어지고,
 * static block 안에서 예외처리를 할 수 있다는 점이 다르다.
 */
public class StaticBlock {
    private static StaticBlock instance;

    private StaticBlock() { }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}
