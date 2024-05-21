package Creational.Factory;

public class CElectronicCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new CElectronicCar();
    }
}
