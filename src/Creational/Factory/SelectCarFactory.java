package Creational.Factory;

public class SelectCarFactory {
    public CarFactory selectCarFactory(String brand, String engine) {
        if("h".equalsIgnoreCase(brand)) {
            return new HyundaiCarFactory();
        } else if("k".equalsIgnoreCase(brand)) {
            return new KiaCarFactory();
        }
        return null;
    }

    public void createCar(String brand, String engine) {
        CarFactory factory = selectCarFactory(brand, engine);
        Car car = factory.createCar(engine);
        car.brand();
        car.engine();
    }
}
