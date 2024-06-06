package Creational.Factory;

public class HyundaiCar implements Car{
    private String engine;

    public HyundaiCar(String engine) {
        this.engine = engine;
    }

    @Override
    public void brand() {
        System.out.println("현대");
    }

    @Override
    public void engine() {
        System.out.println(this.engine);
    }
}
