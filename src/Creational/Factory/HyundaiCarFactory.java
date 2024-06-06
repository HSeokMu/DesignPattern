package Creational.Factory;

public class HyundaiCarFactory implements CarFactory {
    @Override
    public Car createCar(String engine) {
        return new HyundaiCar(engine);
    }
}
