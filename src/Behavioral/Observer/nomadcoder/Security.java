package Behavioral.Observer.nomadcoder;

public class Security implements Observer {
    @Override
    public void notify(String event) {
        if("START".equalsIgnoreCase(event)) {
            System.out.println("DOOR IS CLOSED");
        } else if("END".equalsIgnoreCase(event)) {
            System.out.println("DOOR IS OPEN");
        }
    }
}
