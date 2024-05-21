package Creational.Factory;

public class CGasolineCarFactory implements ICarFactory {

    @Override
    public Car createCar() {
        return new CGasolineCar();
    }
}
