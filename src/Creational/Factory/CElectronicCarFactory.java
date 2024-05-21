package Creational.Factory;

public class CElectronicCarFactory implements ICarFactory {
    @Override
    public Car createCar() {
        return new CElectronicCar();
    }
}
