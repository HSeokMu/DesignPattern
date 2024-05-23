package Creational.Factory;

public class RunFactoryDemo {
    public static void main(String[] args) {
        CGasolineCarFactory gasolineCarFactory = new CGasolineCarFactory();
        CElectronicCarFactory electronicCarFactory = new CElectronicCarFactory();
        
        Car kiaCar = gasolineCarFactory.createCar();
        kiaCar.setName("쏘렌토");
        kiaCar.setSpeed(180);
        System.out.println("기아차 정보 : " + kiaCar);
        
        Car hyundaiCar = electronicCarFactory.createCar();
        hyundaiCar.setName("아이오닉");
        hyundaiCar.setSpeed(220);
        System.out.println("현대차 정보 : " + hyundaiCar);

        CCarFactory carFactory = new CCarFactory();
        Car car1 = carFactory.getCar("hyundai").createCar();
        car1.setName("아이오닉");
        car1.setSpeed(220);
        System.out.println("현대차 정보 : " + car1);

        Car car2 = carFactory.getCar("kia").createCar();
        car2.setName("쏘렌토");
        car2.setSpeed(180);
        System.out.println("기아차 정보 : " + car2);
    }
}
