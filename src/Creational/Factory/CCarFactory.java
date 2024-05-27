package Creational.Factory;

import java.util.Objects;

public class CCarFactory {
    public ICarFactory getCar(String brand) {
        if(Objects.nonNull(brand)) {
            if ("hyundai".equalsIgnoreCase(brand)) {
                return new CElectronicCarFactory();
            } else if("test".equalsIgnoreCase(brand)) {
                return null;
            }
            return new CGasolineCarFactory();
        }
        return null;
    }
}
