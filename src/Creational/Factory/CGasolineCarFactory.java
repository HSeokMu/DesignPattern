package Creational.Factory;

public class CGasolineCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new CGasolineCar();
    }
}
