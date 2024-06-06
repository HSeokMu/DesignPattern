package Creational.Factory;

public class RunFactoryDemo {
    public static void main(String[] args) {
        SelectCarFactory scb = new SelectCarFactory();
        scb.createCar("h", "전기");
    }
}
