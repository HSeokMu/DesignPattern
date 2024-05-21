package Creational.Factory;

public class HelloFactoryPattern {
    public static void main(String[] args) {
        CGasolineCarFactory gasolineCarFactory = new CGasolineCarFactory();
        CElectronicCarFactory electronicCarFactory = new CElectronicCarFactory();
        
        Car kiaCar = gasolineCarFactory.createCar();
        kiaCar.setName("쏘렌토");
        kiaCar.setSpeed(180);
        System.out.println("기아차 이름 : " + kiaCar.getName());
        System.out.println("기아차 속도 : " + kiaCar.getSpeed());
        
        Car hyundaiCar = electronicCarFactory.createCar();
        hyundaiCar.setName("아이오닉");
        hyundaiCar.setSpeed(220);
        System.out.println("현대차 이름 : " + hyundaiCar.getName());
        System.out.println("현대차 속도 : " + hyundaiCar.getSpeed());
    }
}
