package Creational.Factory;

public class KiaCarFactory implements CarFactory {
    @Override
    public Car createCar(String engine) {
        return new KiaCar(engine);
    }
}
