package Creational.Singleton;

public class Singleton {
    private static Singleton instance;
    private String name;

    // Tread Safe Creational.Singleton (synchronized)
    // synchronized를 사용하는 비용은 저렴한 편은 아니다.
    // 우리는 해당 객체를 안전하게 한 번 생성하기 위해 synchronized를 사용하는 것인데
    // 이 TreadSafe1 방법은 해당 객체를 생성한 후 접근할 때에도 계속해서 synchronized를 호출하게 된다.
    // 즉, 싱글톤 객체를 자주 사용해야 한다면 synchronized가 자주 호출되면서 많은 비용이 발생하게 되고 이에 따른 성능 저하가 발생하게 되어
    // TreadSafe2 방법으로 사용하면 비용절감을 할 수 있다.
    public static synchronized Singleton getInstanceTreadSafe1() {
        if (instance == null) instance = new Singleton();
        return instance;
    }

    public static Singleton getInstanceTreadSafe2() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) instance = new Singleton(); // Double-Checked Locking 방식
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}