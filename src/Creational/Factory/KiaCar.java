package Creational.Factory;

public class KiaCar implements Car {
    private String engine;

    public KiaCar(String engine) {
        this.engine = engine;
    }

    @Override
    public void brand() {
        System.out.println("기아");
    }

    @Override
    public void engine() {
        System.out.println(this.engine);
    }
}
