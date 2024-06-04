package Creational.Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        EagerInit.getInstance();

        /*BillPugh bp = BillPugh.getInstance();
        DoubleCheckedLocking dcl = DoubleCheckedLocking.getInstance();*/
    }
}
